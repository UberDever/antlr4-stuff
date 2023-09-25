antlr_v=antlr-4.13.1-complete.jar

export CLASSPATH=".:/usr/local/lib/${antlr_v}:$CLASSPATH"

function antlr4 { 
    java -Xmx500M -cp "/usr/local/lib/${antlr_v}:$CLASSPATH" org.antlr.v4.Tool "$@"
}
export -f antlr4

function grun { 
    java org.antlr.v4.gui.TestRig "$@"
}
export -f grun

antlr4 TypeScriptLexer.g4 TypeScriptParser.g4
javac -cp ".:/usr/local/lib/antlr-4.13.1-complete.jar" *.java
echo Running:
go run pretty.go $(java Main) > tree.lisp
if [ $? -ne -1 ]; then
    echo "Succeess"
fi
# grun TypeScript program Test.ts
