antlr4 TypeScriptLexer.g4 TypeScriptParser.g4
javac -cp ".:/usr/local/lib/antlr-4.13.1-complete.jar" *.java
echo Running:
go run pretty.go $(java Main) > tree.lisp
if [ $? -ne -1 ]; then
    echo "Succeess"
fi
# grun TypeScript program Test.ts
