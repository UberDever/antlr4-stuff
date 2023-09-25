import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class TypeScriptListener implements TypeScriptParserListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	public void enterInitializer(TypeScriptParser.InitializerContext ctx) { enterNode("Initializer"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	public void exitInitializer(TypeScriptParser.InitializerContext ctx) { exitNode("Initializer"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	public void enterBindingPattern(TypeScriptParser.BindingPatternContext ctx) { enterNode("BindingPattern"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#bindingPattern}.
	 * @param ctx the parse tree
	 */
	public void exitBindingPattern(TypeScriptParser.BindingPatternContext ctx) { exitNode("BindingPattern"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	public void enterTypeParameters(TypeScriptParser.TypeParametersContext ctx) { enterNode("TypeParameters"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	public void exitTypeParameters(TypeScriptParser.TypeParametersContext ctx) { exitNode("TypeParameters"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	public void enterTypeParameterList(TypeScriptParser.TypeParameterListContext ctx) { enterNode("TypeParameterList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	public void exitTypeParameterList(TypeScriptParser.TypeParameterListContext ctx) { exitNode("TypeParameterList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	public void enterTypeParameter(TypeScriptParser.TypeParameterContext ctx) { enterNode("TypeParameter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	public void exitTypeParameter(TypeScriptParser.TypeParameterContext ctx) { exitNode("TypeParameter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	public void enterConstraint(TypeScriptParser.ConstraintContext ctx) { enterNode("Constraint"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constraint}.
	 * @param ctx the parse tree
	 */
	public void exitConstraint(TypeScriptParser.ConstraintContext ctx) { exitNode("Constraint"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	public void enterTypeArguments(TypeScriptParser.TypeArgumentsContext ctx) { enterNode("TypeArguments"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	public void exitTypeArguments(TypeScriptParser.TypeArgumentsContext ctx) { exitNode("TypeArguments"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	public void enterTypeArgumentList(TypeScriptParser.TypeArgumentListContext ctx) { enterNode("TypeArgumentList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	public void exitTypeArgumentList(TypeScriptParser.TypeArgumentListContext ctx) { exitNode("TypeArgumentList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	public void enterTypeArgument(TypeScriptParser.TypeArgumentContext ctx) { enterNode("TypeArgument"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	public void exitTypeArgument(TypeScriptParser.TypeArgumentContext ctx) { exitNode("TypeArgument"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	public void enterType_(TypeScriptParser.Type_Context ctx) { enterNode("Type_"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#type_}.
	 * @param ctx the parse tree
	 */
	public void exitType_(TypeScriptParser.Type_Context ctx) { exitNode("Type_"); }
	/**
	 * Enter a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void enterIntersection(TypeScriptParser.IntersectionContext ctx) { enterNode("Intersection"); }
	/**
	 * Exit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void exitIntersection(TypeScriptParser.IntersectionContext ctx) { exitNode("Intersection"); }
	/**
	 * Enter a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void enterPrimary(TypeScriptParser.PrimaryContext ctx) { enterNode("Primary"); }
	/**
	 * Exit a parse tree produced by the {@code Primary}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void exitPrimary(TypeScriptParser.PrimaryContext ctx) { exitNode("Primary"); }
	/**
	 * Enter a parse tree produced by the {@code Union}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void enterUnion(TypeScriptParser.UnionContext ctx) { enterNode("Union"); }
	/**
	 * Exit a parse tree produced by the {@code Union}
	 * labeled alternative in {@link TypeScriptParser#unionOrIntersectionOrPrimaryType}.
	 * @param ctx the parse tree
	 */
	public void exitUnion(TypeScriptParser.UnionContext ctx) { exitNode("Union"); }
	/**
	 * Enter a parse tree produced by the {@code RedefinitionOfType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterRedefinitionOfType(TypeScriptParser.RedefinitionOfTypeContext ctx) { enterNode("RedefinitionOfType"); }
	/**
	 * Exit a parse tree produced by the {@code RedefinitionOfType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitRedefinitionOfType(TypeScriptParser.RedefinitionOfTypeContext ctx) { exitNode("RedefinitionOfType"); }
	/**
	 * Enter a parse tree produced by the {@code PredefinedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterPredefinedPrimType(TypeScriptParser.PredefinedPrimTypeContext ctx) { enterNode("PredefinedPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code PredefinedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitPredefinedPrimType(TypeScriptParser.PredefinedPrimTypeContext ctx) { exitNode("PredefinedPrimType"); }
	/**
	 * Enter a parse tree produced by the {@code ArrayPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterArrayPrimType(TypeScriptParser.ArrayPrimTypeContext ctx) { enterNode("ArrayPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code ArrayPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitArrayPrimType(TypeScriptParser.ArrayPrimTypeContext ctx) { exitNode("ArrayPrimType"); }
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterParenthesizedPrimType(TypeScriptParser.ParenthesizedPrimTypeContext ctx) { enterNode("ParenthesizedPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitParenthesizedPrimType(TypeScriptParser.ParenthesizedPrimTypeContext ctx) { exitNode("ParenthesizedPrimType"); }
	/**
	 * Enter a parse tree produced by the {@code ThisPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterThisPrimType(TypeScriptParser.ThisPrimTypeContext ctx) { enterNode("ThisPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code ThisPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitThisPrimType(TypeScriptParser.ThisPrimTypeContext ctx) { exitNode("ThisPrimType"); }
	/**
	 * Enter a parse tree produced by the {@code TuplePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterTuplePrimType(TypeScriptParser.TuplePrimTypeContext ctx) { enterNode("TuplePrimType"); }
	/**
	 * Exit a parse tree produced by the {@code TuplePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitTuplePrimType(TypeScriptParser.TuplePrimTypeContext ctx) { exitNode("TuplePrimType"); }
	/**
	 * Enter a parse tree produced by the {@code ObjectPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterObjectPrimType(TypeScriptParser.ObjectPrimTypeContext ctx) { enterNode("ObjectPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code ObjectPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitObjectPrimType(TypeScriptParser.ObjectPrimTypeContext ctx) { exitNode("ObjectPrimType"); }
	/**
	 * Enter a parse tree produced by the {@code ReferencePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterReferencePrimType(TypeScriptParser.ReferencePrimTypeContext ctx) { enterNode("ReferencePrimType"); }
	/**
	 * Exit a parse tree produced by the {@code ReferencePrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitReferencePrimType(TypeScriptParser.ReferencePrimTypeContext ctx) { exitNode("ReferencePrimType"); }
	/**
	 * Enter a parse tree produced by the {@code QueryPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void enterQueryPrimType(TypeScriptParser.QueryPrimTypeContext ctx) { enterNode("QueryPrimType"); }
	/**
	 * Exit a parse tree produced by the {@code QueryPrimType}
	 * labeled alternative in {@link TypeScriptParser#primaryType}.
	 * @param ctx the parse tree
	 */
	public void exitQueryPrimType(TypeScriptParser.QueryPrimTypeContext ctx) { exitNode("QueryPrimType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	public void enterPredefinedType(TypeScriptParser.PredefinedTypeContext ctx) { enterNode("PredefinedType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	public void exitPredefinedType(TypeScriptParser.PredefinedTypeContext ctx) { exitNode("PredefinedType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	public void enterTypeReference(TypeScriptParser.TypeReferenceContext ctx) { enterNode("TypeReference"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeReference}.
	 * @param ctx the parse tree
	 */
	public void exitTypeReference(TypeScriptParser.TypeReferenceContext ctx) { exitNode("TypeReference"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#nestedTypeGeneric}.
	 * @param ctx the parse tree
	 */
	public void enterNestedTypeGeneric(TypeScriptParser.NestedTypeGenericContext ctx) { enterNode("NestedTypeGeneric"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#nestedTypeGeneric}.
	 * @param ctx the parse tree
	 */
	public void exitNestedTypeGeneric(TypeScriptParser.NestedTypeGenericContext ctx) { exitNode("NestedTypeGeneric"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeGeneric}.
	 * @param ctx the parse tree
	 */
	public void enterTypeGeneric(TypeScriptParser.TypeGenericContext ctx) { enterNode("TypeGeneric"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeGeneric}.
	 * @param ctx the parse tree
	 */
	public void exitTypeGeneric(TypeScriptParser.TypeGenericContext ctx) { exitNode("TypeGeneric"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeIncludeGeneric}.
	 * @param ctx the parse tree
	 */
	public void enterTypeIncludeGeneric(TypeScriptParser.TypeIncludeGenericContext ctx) { enterNode("TypeIncludeGeneric"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeIncludeGeneric}.
	 * @param ctx the parse tree
	 */
	public void exitTypeIncludeGeneric(TypeScriptParser.TypeIncludeGenericContext ctx) { exitNode("TypeIncludeGeneric"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	public void enterTypeName(TypeScriptParser.TypeNameContext ctx) { enterNode("TypeName"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeName}.
	 * @param ctx the parse tree
	 */
	public void exitTypeName(TypeScriptParser.TypeNameContext ctx) { exitNode("TypeName"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	public void enterObjectType(TypeScriptParser.ObjectTypeContext ctx) { enterNode("ObjectType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectType}.
	 * @param ctx the parse tree
	 */
	public void exitObjectType(TypeScriptParser.ObjectTypeContext ctx) { exitNode("ObjectType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	public void enterTypeBody(TypeScriptParser.TypeBodyContext ctx) { enterNode("TypeBody"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeBody}.
	 * @param ctx the parse tree
	 */
	public void exitTypeBody(TypeScriptParser.TypeBodyContext ctx) { exitNode("TypeBody"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	public void enterTypeMemberList(TypeScriptParser.TypeMemberListContext ctx) { enterNode("TypeMemberList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeMemberList}.
	 * @param ctx the parse tree
	 */
	public void exitTypeMemberList(TypeScriptParser.TypeMemberListContext ctx) { exitNode("TypeMemberList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	public void enterTypeMember(TypeScriptParser.TypeMemberContext ctx) { enterNode("TypeMember"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeMember}.
	 * @param ctx the parse tree
	 */
	public void exitTypeMember(TypeScriptParser.TypeMemberContext ctx) { exitNode("TypeMember"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	public void enterArrayType(TypeScriptParser.ArrayTypeContext ctx) { enterNode("ArrayType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayType}.
	 * @param ctx the parse tree
	 */
	public void exitArrayType(TypeScriptParser.ArrayTypeContext ctx) { exitNode("ArrayType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	public void enterTupleType(TypeScriptParser.TupleTypeContext ctx) { enterNode("TupleType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tupleType}.
	 * @param ctx the parse tree
	 */
	public void exitTupleType(TypeScriptParser.TupleTypeContext ctx) { exitNode("TupleType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	public void enterTupleElementTypes(TypeScriptParser.TupleElementTypesContext ctx) { enterNode("TupleElementTypes"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tupleElementTypes}.
	 * @param ctx the parse tree
	 */
	public void exitTupleElementTypes(TypeScriptParser.TupleElementTypesContext ctx) { exitNode("TupleElementTypes"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionType(TypeScriptParser.FunctionTypeContext ctx) { enterNode("FunctionType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionType(TypeScriptParser.FunctionTypeContext ctx) { exitNode("FunctionType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	public void enterConstructorType(TypeScriptParser.ConstructorTypeContext ctx) { enterNode("ConstructorType"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorType}.
	 * @param ctx the parse tree
	 */
	public void exitConstructorType(TypeScriptParser.ConstructorTypeContext ctx) { exitNode("ConstructorType"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	public void enterTypeQuery(TypeScriptParser.TypeQueryContext ctx) { enterNode("TypeQuery"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeQuery}.
	 * @param ctx the parse tree
	 */
	public void exitTypeQuery(TypeScriptParser.TypeQueryContext ctx) { exitNode("TypeQuery"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	public void enterTypeQueryExpression(TypeScriptParser.TypeQueryExpressionContext ctx) { enterNode("TypeQueryExpression"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeQueryExpression}.
	 * @param ctx the parse tree
	 */
	public void exitTypeQueryExpression(TypeScriptParser.TypeQueryExpressionContext ctx) { exitNode("TypeQueryExpression"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertySignatur}.
	 * @param ctx the parse tree
	 */
	public void enterPropertySignatur(TypeScriptParser.PropertySignaturContext ctx) { enterNode("PropertySignatur"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertySignatur}.
	 * @param ctx the parse tree
	 */
	public void exitPropertySignatur(TypeScriptParser.PropertySignaturContext ctx) { exitNode("PropertySignatur"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	public void enterTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx) { enterNode("TypeAnnotation"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	public void exitTypeAnnotation(TypeScriptParser.TypeAnnotationContext ctx) { exitNode("TypeAnnotation"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	public void enterCallSignature(TypeScriptParser.CallSignatureContext ctx) { enterNode("CallSignature"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#callSignature}.
	 * @param ctx the parse tree
	 */
	public void exitCallSignature(TypeScriptParser.CallSignatureContext ctx) { exitNode("CallSignature"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	public void enterParameterList(TypeScriptParser.ParameterListContext ctx) { enterNode("ParameterList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameterList}.
	 * @param ctx the parse tree
	 */
	public void exitParameterList(TypeScriptParser.ParameterListContext ctx) { exitNode("ParameterList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	public void enterRequiredParameterList(TypeScriptParser.RequiredParameterListContext ctx) { enterNode("RequiredParameterList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#requiredParameterList}.
	 * @param ctx the parse tree
	 */
	public void exitRequiredParameterList(TypeScriptParser.RequiredParameterListContext ctx) { exitNode("RequiredParameterList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	public void enterParameter(TypeScriptParser.ParameterContext ctx) { enterNode("Parameter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#parameter}.
	 * @param ctx the parse tree
	 */
	public void exitParameter(TypeScriptParser.ParameterContext ctx) { exitNode("Parameter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	public void enterOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) { enterNode("OptionalParameter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#optionalParameter}.
	 * @param ctx the parse tree
	 */
	public void exitOptionalParameter(TypeScriptParser.OptionalParameterContext ctx) { exitNode("OptionalParameter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	public void enterRestParameter(TypeScriptParser.RestParameterContext ctx) { enterNode("RestParameter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#restParameter}.
	 * @param ctx the parse tree
	 */
	public void exitRestParameter(TypeScriptParser.RestParameterContext ctx) { exitNode("RestParameter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	public void enterRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) { enterNode("RequiredParameter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#requiredParameter}.
	 * @param ctx the parse tree
	 */
	public void exitRequiredParameter(TypeScriptParser.RequiredParameterContext ctx) { exitNode("RequiredParameter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	public void enterAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) { enterNode("AccessibilityModifier"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#accessibilityModifier}.
	 * @param ctx the parse tree
	 */
	public void exitAccessibilityModifier(TypeScriptParser.AccessibilityModifierContext ctx) { exitNode("AccessibilityModifier"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	public void enterIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx) { enterNode("IdentifierOrPattern"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrPattern}.
	 * @param ctx the parse tree
	 */
	public void exitIdentifierOrPattern(TypeScriptParser.IdentifierOrPatternContext ctx) { exitNode("IdentifierOrPattern"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	public void enterConstructSignature(TypeScriptParser.ConstructSignatureContext ctx) { enterNode("ConstructSignature"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructSignature}.
	 * @param ctx the parse tree
	 */
	public void exitConstructSignature(TypeScriptParser.ConstructSignatureContext ctx) { exitNode("ConstructSignature"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	public void enterIndexSignature(TypeScriptParser.IndexSignatureContext ctx) { enterNode("IndexSignature"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#indexSignature}.
	 * @param ctx the parse tree
	 */
	public void exitIndexSignature(TypeScriptParser.IndexSignatureContext ctx) { exitNode("IndexSignature"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	public void enterMethodSignature(TypeScriptParser.MethodSignatureContext ctx) { enterNode("MethodSignature"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	public void exitMethodSignature(TypeScriptParser.MethodSignatureContext ctx) { exitNode("MethodSignature"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterTypeAliasDeclaration(TypeScriptParser.TypeAliasDeclarationContext ctx) { enterNode("TypeAliasDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#typeAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitTypeAliasDeclaration(TypeScriptParser.TypeAliasDeclarationContext ctx) { exitNode("TypeAliasDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) { enterNode("ConstructorDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitConstructorDeclaration(TypeScriptParser.ConstructorDeclarationContext ctx) { exitNode("ConstructorDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) { enterNode("InterfaceDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitInterfaceDeclaration(TypeScriptParser.InterfaceDeclarationContext ctx) { exitNode("InterfaceDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	public void enterInterfaceExtendsClause(TypeScriptParser.InterfaceExtendsClauseContext ctx) { enterNode("InterfaceExtendsClause"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#interfaceExtendsClause}.
	 * @param ctx the parse tree
	 */
	public void exitInterfaceExtendsClause(TypeScriptParser.InterfaceExtendsClauseContext ctx) { exitNode("InterfaceExtendsClause"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	public void enterClassOrInterfaceTypeList(TypeScriptParser.ClassOrInterfaceTypeListContext ctx) { enterNode("ClassOrInterfaceTypeList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classOrInterfaceTypeList}.
	 * @param ctx the parse tree
	 */
	public void exitClassOrInterfaceTypeList(TypeScriptParser.ClassOrInterfaceTypeListContext ctx) { exitNode("ClassOrInterfaceTypeList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterEnumDeclaration(TypeScriptParser.EnumDeclarationContext ctx) { enterNode("EnumDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitEnumDeclaration(TypeScriptParser.EnumDeclarationContext ctx) { exitNode("EnumDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	public void enterEnumBody(TypeScriptParser.EnumBodyContext ctx) { enterNode("EnumBody"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumBody}.
	 * @param ctx the parse tree
	 */
	public void exitEnumBody(TypeScriptParser.EnumBodyContext ctx) { exitNode("EnumBody"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	public void enterEnumMemberList(TypeScriptParser.EnumMemberListContext ctx) { enterNode("EnumMemberList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumMemberList}.
	 * @param ctx the parse tree
	 */
	public void exitEnumMemberList(TypeScriptParser.EnumMemberListContext ctx) { exitNode("EnumMemberList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	public void enterEnumMember(TypeScriptParser.EnumMemberContext ctx) { enterNode("EnumMember"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#enumMember}.
	 * @param ctx the parse tree
	 */
	public void exitEnumMember(TypeScriptParser.EnumMemberContext ctx) { exitNode("EnumMember"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterNamespaceDeclaration(TypeScriptParser.NamespaceDeclarationContext ctx) { enterNode("NamespaceDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#namespaceDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitNamespaceDeclaration(TypeScriptParser.NamespaceDeclarationContext ctx) { exitNode("NamespaceDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	public void enterNamespaceName(TypeScriptParser.NamespaceNameContext ctx) { enterNode("NamespaceName"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#namespaceName}.
	 * @param ctx the parse tree
	 */
	public void exitNamespaceName(TypeScriptParser.NamespaceNameContext ctx) { exitNode("NamespaceName"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterImportAliasDeclaration(TypeScriptParser.ImportAliasDeclarationContext ctx) { enterNode("ImportAliasDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importAliasDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitImportAliasDeclaration(TypeScriptParser.ImportAliasDeclarationContext ctx) { exitNode("ImportAliasDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorList}.
	 * @param ctx the parse tree
	 */
	public void enterDecoratorList(TypeScriptParser.DecoratorListContext ctx) { enterNode("DecoratorList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorList}.
	 * @param ctx the parse tree
	 */
	public void exitDecoratorList(TypeScriptParser.DecoratorListContext ctx) { exitNode("DecoratorList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	public void enterDecorator(TypeScriptParser.DecoratorContext ctx) { enterNode("Decorator"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decorator}.
	 * @param ctx the parse tree
	 */
	public void exitDecorator(TypeScriptParser.DecoratorContext ctx) { exitNode("Decorator"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	public void enterDecoratorMemberExpression(TypeScriptParser.DecoratorMemberExpressionContext ctx) { enterNode("DecoratorMemberExpression"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorMemberExpression}.
	 * @param ctx the parse tree
	 */
	public void exitDecoratorMemberExpression(TypeScriptParser.DecoratorMemberExpressionContext ctx) { exitNode("DecoratorMemberExpression"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	public void enterDecoratorCallExpression(TypeScriptParser.DecoratorCallExpressionContext ctx) { enterNode("DecoratorCallExpression"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#decoratorCallExpression}.
	 * @param ctx the parse tree
	 */
	public void exitDecoratorCallExpression(TypeScriptParser.DecoratorCallExpressionContext ctx) { exitNode("DecoratorCallExpression"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	public void enterProgram(TypeScriptParser.ProgramContext ctx) { enterNode("Program"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	public void exitProgram(TypeScriptParser.ProgramContext ctx) { exitNode("Program"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	public void enterSourceElement(TypeScriptParser.SourceElementContext ctx) { enterNode("SourceElement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	public void exitSourceElement(TypeScriptParser.SourceElementContext ctx) { exitNode("SourceElement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	public void enterStatement(TypeScriptParser.StatementContext ctx) { enterNode("Statement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	public void exitStatement(TypeScriptParser.StatementContext ctx) { exitNode("Statement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	public void enterBlock(TypeScriptParser.BlockContext ctx) { enterNode("Block"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#block}.
	 * @param ctx the parse tree
	 */
	public void exitBlock(TypeScriptParser.BlockContext ctx) { exitNode("Block"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	public void enterStatementList(TypeScriptParser.StatementListContext ctx) { enterNode("StatementList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#statementList}.
	 * @param ctx the parse tree
	 */
	public void exitStatementList(TypeScriptParser.StatementListContext ctx) { exitNode("StatementList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterAbstractDeclaration(TypeScriptParser.AbstractDeclarationContext ctx) { enterNode("AbstractDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#abstractDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitAbstractDeclaration(TypeScriptParser.AbstractDeclarationContext ctx) { exitNode("AbstractDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	public void enterImportStatement(TypeScriptParser.ImportStatementContext ctx) { enterNode("ImportStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#importStatement}.
	 * @param ctx the parse tree
	 */
	public void exitImportStatement(TypeScriptParser.ImportStatementContext ctx) { exitNode("ImportStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#fromBlock}.
	 * @param ctx the parse tree
	 */
	public void enterFromBlock(TypeScriptParser.FromBlockContext ctx) { enterNode("FromBlock"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#fromBlock}.
	 * @param ctx the parse tree
	 */
	public void exitFromBlock(TypeScriptParser.FromBlockContext ctx) { exitNode("FromBlock"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#multipleImportStatement}.
	 * @param ctx the parse tree
	 */
	public void enterMultipleImportStatement(TypeScriptParser.MultipleImportStatementContext ctx) { enterNode("MultipleImportStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#multipleImportStatement}.
	 * @param ctx the parse tree
	 */
	public void exitMultipleImportStatement(TypeScriptParser.MultipleImportStatementContext ctx) { exitNode("MultipleImportStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	public void enterExportStatement(TypeScriptParser.ExportStatementContext ctx) { enterNode("ExportStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	public void exitExportStatement(TypeScriptParser.ExportStatementContext ctx) { exitNode("ExportStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	public void enterVariableStatement(TypeScriptParser.VariableStatementContext ctx) { enterNode("VariableStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	public void exitVariableStatement(TypeScriptParser.VariableStatementContext ctx) { exitNode("VariableStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	public void enterVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) { enterNode("VariableDeclarationList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	public void exitVariableDeclarationList(TypeScriptParser.VariableDeclarationListContext ctx) { exitNode("VariableDeclarationList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) { enterNode("VariableDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitVariableDeclaration(TypeScriptParser.VariableDeclarationContext ctx) { exitNode("VariableDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	public void enterEmptyStatement_(TypeScriptParser.EmptyStatement_Context ctx) { enterNode("EmptyStatement_"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	public void exitEmptyStatement_(TypeScriptParser.EmptyStatement_Context ctx) { exitNode("EmptyStatement_"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	public void enterExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) { enterNode("ExpressionStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	public void exitExpressionStatement(TypeScriptParser.ExpressionStatementContext ctx) { exitNode("ExpressionStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	public void enterIfStatement(TypeScriptParser.IfStatementContext ctx) { enterNode("IfStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	public void exitIfStatement(TypeScriptParser.IfStatementContext ctx) { exitNode("IfStatement"); }
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterDoStatement(TypeScriptParser.DoStatementContext ctx) { enterNode("DoStatement"); }
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitDoStatement(TypeScriptParser.DoStatementContext ctx) { exitNode("DoStatement"); }
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterWhileStatement(TypeScriptParser.WhileStatementContext ctx) { enterNode("WhileStatement"); }
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitWhileStatement(TypeScriptParser.WhileStatementContext ctx) { exitNode("WhileStatement"); }
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterForStatement(TypeScriptParser.ForStatementContext ctx) { enterNode("ForStatement"); }
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitForStatement(TypeScriptParser.ForStatementContext ctx) { exitNode("ForStatement"); }
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterForVarStatement(TypeScriptParser.ForVarStatementContext ctx) { enterNode("ForVarStatement"); }
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitForVarStatement(TypeScriptParser.ForVarStatementContext ctx) { exitNode("ForVarStatement"); }
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterForInStatement(TypeScriptParser.ForInStatementContext ctx) { enterNode("ForInStatement"); }
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitForInStatement(TypeScriptParser.ForInStatementContext ctx) { exitNode("ForInStatement"); }
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void enterForVarInStatement(TypeScriptParser.ForVarInStatementContext ctx) { enterNode("ForVarInStatement"); }
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link TypeScriptParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	public void exitForVarInStatement(TypeScriptParser.ForVarInStatementContext ctx) { exitNode("ForVarInStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	public void enterVarModifier(TypeScriptParser.VarModifierContext ctx) { enterNode("VarModifier"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#varModifier}.
	 * @param ctx the parse tree
	 */
	public void exitVarModifier(TypeScriptParser.VarModifierContext ctx) { exitNode("VarModifier"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	public void enterContinueStatement(TypeScriptParser.ContinueStatementContext ctx) { enterNode("ContinueStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	public void exitContinueStatement(TypeScriptParser.ContinueStatementContext ctx) { exitNode("ContinueStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	public void enterBreakStatement(TypeScriptParser.BreakStatementContext ctx) { enterNode("BreakStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	public void exitBreakStatement(TypeScriptParser.BreakStatementContext ctx) { exitNode("BreakStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	public void enterReturnStatement(TypeScriptParser.ReturnStatementContext ctx) { enterNode("ReturnStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	public void exitReturnStatement(TypeScriptParser.ReturnStatementContext ctx) { exitNode("ReturnStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	public void enterYieldStatement(TypeScriptParser.YieldStatementContext ctx) { enterNode("YieldStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#yieldStatement}.
	 * @param ctx the parse tree
	 */
	public void exitYieldStatement(TypeScriptParser.YieldStatementContext ctx) { exitNode("YieldStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	public void enterWithStatement(TypeScriptParser.WithStatementContext ctx) { enterNode("WithStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#withStatement}.
	 * @param ctx the parse tree
	 */
	public void exitWithStatement(TypeScriptParser.WithStatementContext ctx) { exitNode("WithStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	public void enterSwitchStatement(TypeScriptParser.SwitchStatementContext ctx) { enterNode("SwitchStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	public void exitSwitchStatement(TypeScriptParser.SwitchStatementContext ctx) { exitNode("SwitchStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	public void enterCaseBlock(TypeScriptParser.CaseBlockContext ctx) { enterNode("CaseBlock"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	public void exitCaseBlock(TypeScriptParser.CaseBlockContext ctx) { exitNode("CaseBlock"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	public void enterCaseClauses(TypeScriptParser.CaseClausesContext ctx) { enterNode("CaseClauses"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	public void exitCaseClauses(TypeScriptParser.CaseClausesContext ctx) { exitNode("CaseClauses"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	public void enterCaseClause(TypeScriptParser.CaseClauseContext ctx) { enterNode("CaseClause"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#caseClause}.
	 * @param ctx the parse tree
	 */
	public void exitCaseClause(TypeScriptParser.CaseClauseContext ctx) { exitNode("CaseClause"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	public void enterDefaultClause(TypeScriptParser.DefaultClauseContext ctx) { enterNode("DefaultClause"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	public void exitDefaultClause(TypeScriptParser.DefaultClauseContext ctx) { exitNode("DefaultClause"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	public void enterLabelledStatement(TypeScriptParser.LabelledStatementContext ctx) { enterNode("LabelledStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	public void exitLabelledStatement(TypeScriptParser.LabelledStatementContext ctx) { exitNode("LabelledStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	public void enterThrowStatement(TypeScriptParser.ThrowStatementContext ctx) { enterNode("ThrowStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	public void exitThrowStatement(TypeScriptParser.ThrowStatementContext ctx) { exitNode("ThrowStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	public void enterTryStatement(TypeScriptParser.TryStatementContext ctx) { enterNode("TryStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	public void exitTryStatement(TypeScriptParser.TryStatementContext ctx) { exitNode("TryStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	public void enterCatchProduction(TypeScriptParser.CatchProductionContext ctx) { enterNode("CatchProduction"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	public void exitCatchProduction(TypeScriptParser.CatchProductionContext ctx) { exitNode("CatchProduction"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	public void enterFinallyProduction(TypeScriptParser.FinallyProductionContext ctx) { enterNode("FinallyProduction"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	public void exitFinallyProduction(TypeScriptParser.FinallyProductionContext ctx) { exitNode("FinallyProduction"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	public void enterDebuggerStatement(TypeScriptParser.DebuggerStatementContext ctx) { enterNode("DebuggerStatement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	public void exitDebuggerStatement(TypeScriptParser.DebuggerStatementContext ctx) { exitNode("DebuggerStatement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) { enterNode("FunctionDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionDeclaration(TypeScriptParser.FunctionDeclarationContext ctx) { exitNode("FunctionDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) { enterNode("ClassDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitClassDeclaration(TypeScriptParser.ClassDeclarationContext ctx) { exitNode("ClassDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	public void enterClassHeritage(TypeScriptParser.ClassHeritageContext ctx) { enterNode("ClassHeritage"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classHeritage}.
	 * @param ctx the parse tree
	 */
	public void exitClassHeritage(TypeScriptParser.ClassHeritageContext ctx) { exitNode("ClassHeritage"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	public void enterClassTail(TypeScriptParser.ClassTailContext ctx) { enterNode("ClassTail"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classTail}.
	 * @param ctx the parse tree
	 */
	public void exitClassTail(TypeScriptParser.ClassTailContext ctx) { exitNode("ClassTail"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	public void enterClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx) { enterNode("ClassExtendsClause"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classExtendsClause}.
	 * @param ctx the parse tree
	 */
	public void exitClassExtendsClause(TypeScriptParser.ClassExtendsClauseContext ctx) { exitNode("ClassExtendsClause"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	public void enterImplementsClause(TypeScriptParser.ImplementsClauseContext ctx) { enterNode("ImplementsClause"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#implementsClause}.
	 * @param ctx the parse tree
	 */
	public void exitImplementsClause(TypeScriptParser.ImplementsClauseContext ctx) { exitNode("ImplementsClause"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	public void enterClassElement(TypeScriptParser.ClassElementContext ctx) { enterNode("ClassElement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classElement}.
	 * @param ctx the parse tree
	 */
	public void exitClassElement(TypeScriptParser.ClassElementContext ctx) { exitNode("ClassElement"); }
	/**
	 * Enter a parse tree produced by the {@code PropertyDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) { enterNode("PropertyDeclarationExpression"); }
	/**
	 * Exit a parse tree produced by the {@code PropertyDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyDeclarationExpression(TypeScriptParser.PropertyDeclarationExpressionContext ctx) { exitNode("PropertyDeclarationExpression"); }
	/**
	 * Enter a parse tree produced by the {@code MethodDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) { enterNode("MethodDeclarationExpression"); }
	/**
	 * Exit a parse tree produced by the {@code MethodDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitMethodDeclarationExpression(TypeScriptParser.MethodDeclarationExpressionContext ctx) { exitNode("MethodDeclarationExpression"); }
	/**
	 * Enter a parse tree produced by the {@code GetterSetterDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterGetterSetterDeclarationExpression(TypeScriptParser.GetterSetterDeclarationExpressionContext ctx) { enterNode("GetterSetterDeclarationExpression"); }
	/**
	 * Exit a parse tree produced by the {@code GetterSetterDeclarationExpression}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitGetterSetterDeclarationExpression(TypeScriptParser.GetterSetterDeclarationExpressionContext ctx) { exitNode("GetterSetterDeclarationExpression"); }
	/**
	 * Enter a parse tree produced by the {@code AbstractMemberDeclaration}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterAbstractMemberDeclaration(TypeScriptParser.AbstractMemberDeclarationContext ctx) { enterNode("AbstractMemberDeclaration"); }
	/**
	 * Exit a parse tree produced by the {@code AbstractMemberDeclaration}
	 * labeled alternative in {@link TypeScriptParser#propertyMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitAbstractMemberDeclaration(TypeScriptParser.AbstractMemberDeclarationContext ctx) { exitNode("AbstractMemberDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) { enterNode("PropertyMemberBase"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyMemberBase}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyMemberBase(TypeScriptParser.PropertyMemberBaseContext ctx) { exitNode("PropertyMemberBase"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterIndexMemberDeclaration(TypeScriptParser.IndexMemberDeclarationContext ctx) { enterNode("IndexMemberDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#indexMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitIndexMemberDeclaration(TypeScriptParser.IndexMemberDeclarationContext ctx) { exitNode("IndexMemberDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorMethod}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorMethod(TypeScriptParser.GeneratorMethodContext ctx) { enterNode("GeneratorMethod"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorMethod}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorMethod(TypeScriptParser.GeneratorMethodContext ctx) { exitNode("GeneratorMethod"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorFunctionDeclaration(TypeScriptParser.GeneratorFunctionDeclarationContext ctx) { enterNode("GeneratorFunctionDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorFunctionDeclaration(TypeScriptParser.GeneratorFunctionDeclarationContext ctx) { exitNode("GeneratorFunctionDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorBlock}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorBlock(TypeScriptParser.GeneratorBlockContext ctx) { enterNode("GeneratorBlock"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorBlock}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorBlock(TypeScriptParser.GeneratorBlockContext ctx) { exitNode("GeneratorBlock"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#generatorDefinition}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorDefinition(TypeScriptParser.GeneratorDefinitionContext ctx) { enterNode("GeneratorDefinition"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#generatorDefinition}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorDefinition(TypeScriptParser.GeneratorDefinitionContext ctx) { exitNode("GeneratorDefinition"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	public void enterIteratorBlock(TypeScriptParser.IteratorBlockContext ctx) { enterNode("IteratorBlock"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#iteratorBlock}.
	 * @param ctx the parse tree
	 */
	public void exitIteratorBlock(TypeScriptParser.IteratorBlockContext ctx) { exitNode("IteratorBlock"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	public void enterIteratorDefinition(TypeScriptParser.IteratorDefinitionContext ctx) { enterNode("IteratorDefinition"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#iteratorDefinition}.
	 * @param ctx the parse tree
	 */
	public void exitIteratorDefinition(TypeScriptParser.IteratorDefinitionContext ctx) { exitNode("IteratorDefinition"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	public void enterFormalParameterList(TypeScriptParser.FormalParameterListContext ctx) { enterNode("FormalParameterList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	public void exitFormalParameterList(TypeScriptParser.FormalParameterListContext ctx) { exitNode("FormalParameterList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	public void enterFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx) { enterNode("FormalParameterArg"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#formalParameterArg}.
	 * @param ctx the parse tree
	 */
	public void exitFormalParameterArg(TypeScriptParser.FormalParameterArgContext ctx) { exitNode("FormalParameterArg"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	public void enterLastFormalParameterArg(TypeScriptParser.LastFormalParameterArgContext ctx) { enterNode("LastFormalParameterArg"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#lastFormalParameterArg}.
	 * @param ctx the parse tree
	 */
	public void exitLastFormalParameterArg(TypeScriptParser.LastFormalParameterArgContext ctx) { exitNode("LastFormalParameterArg"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionBody(TypeScriptParser.FunctionBodyContext ctx) { enterNode("FunctionBody"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionBody(TypeScriptParser.FunctionBodyContext ctx) { exitNode("FunctionBody"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	public void enterSourceElements(TypeScriptParser.SourceElementsContext ctx) { enterNode("SourceElements"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	public void exitSourceElements(TypeScriptParser.SourceElementsContext ctx) { exitNode("SourceElements"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	public void enterArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) { enterNode("ArrayLiteral"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	public void exitArrayLiteral(TypeScriptParser.ArrayLiteralContext ctx) { exitNode("ArrayLiteral"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	public void enterElementList(TypeScriptParser.ElementListContext ctx) { enterNode("ElementList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#elementList}.
	 * @param ctx the parse tree
	 */
	public void exitElementList(TypeScriptParser.ElementListContext ctx) { exitNode("ElementList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	public void enterArrayElement(TypeScriptParser.ArrayElementContext ctx) { enterNode("ArrayElement"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	public void exitArrayElement(TypeScriptParser.ArrayElementContext ctx) { exitNode("ArrayElement"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	public void enterObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) { enterNode("ObjectLiteral"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	public void exitObjectLiteral(TypeScriptParser.ObjectLiteralContext ctx) { exitNode("ObjectLiteral"); }
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyExpressionAssignment(TypeScriptParser.PropertyExpressionAssignmentContext ctx) { enterNode("PropertyExpressionAssignment"); }
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyExpressionAssignment(TypeScriptParser.PropertyExpressionAssignmentContext ctx) { exitNode("PropertyExpressionAssignment"); }
	/**
	 * Enter a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterComputedPropertyExpressionAssignment(TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx) { enterNode("ComputedPropertyExpressionAssignment"); }
	/**
	 * Exit a parse tree produced by the {@code ComputedPropertyExpressionAssignment}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitComputedPropertyExpressionAssignment(TypeScriptParser.ComputedPropertyExpressionAssignmentContext ctx) { exitNode("ComputedPropertyExpressionAssignment"); }
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyGetter(TypeScriptParser.PropertyGetterContext ctx) { enterNode("PropertyGetter"); }
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyGetter(TypeScriptParser.PropertyGetterContext ctx) { exitNode("PropertyGetter"); }
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterPropertySetter(TypeScriptParser.PropertySetterContext ctx) { enterNode("PropertySetter"); }
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitPropertySetter(TypeScriptParser.PropertySetterContext ctx) { exitNode("PropertySetter"); }
	/**
	 * Enter a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterMethodProperty(TypeScriptParser.MethodPropertyContext ctx) { enterNode("MethodProperty"); }
	/**
	 * Exit a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitMethodProperty(TypeScriptParser.MethodPropertyContext ctx) { exitNode("MethodProperty"); }
	/**
	 * Enter a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyShorthand(TypeScriptParser.PropertyShorthandContext ctx) { enterNode("PropertyShorthand"); }
	/**
	 * Exit a parse tree produced by the {@code PropertyShorthand}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyShorthand(TypeScriptParser.PropertyShorthandContext ctx) { exitNode("PropertyShorthand"); }
	/**
	 * Enter a parse tree produced by the {@code RestParameterInObject}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void enterRestParameterInObject(TypeScriptParser.RestParameterInObjectContext ctx) { enterNode("RestParameterInObject"); }
	/**
	 * Exit a parse tree produced by the {@code RestParameterInObject}
	 * labeled alternative in {@link TypeScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	public void exitRestParameterInObject(TypeScriptParser.RestParameterInObjectContext ctx) { exitNode("RestParameterInObject"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	public void enterGetAccessor(TypeScriptParser.GetAccessorContext ctx) { enterNode("GetAccessor"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#getAccessor}.
	 * @param ctx the parse tree
	 */
	public void exitGetAccessor(TypeScriptParser.GetAccessorContext ctx) { exitNode("GetAccessor"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	public void enterSetAccessor(TypeScriptParser.SetAccessorContext ctx) { enterNode("SetAccessor"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#setAccessor}.
	 * @param ctx the parse tree
	 */
	public void exitSetAccessor(TypeScriptParser.SetAccessorContext ctx) { exitNode("SetAccessor"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	public void enterPropertyName(TypeScriptParser.PropertyNameContext ctx) { enterNode("PropertyName"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#propertyName}.
	 * @param ctx the parse tree
	 */
	public void exitPropertyName(TypeScriptParser.PropertyNameContext ctx) { exitNode("PropertyName"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	public void enterArguments(TypeScriptParser.ArgumentsContext ctx) { enterNode("Arguments"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	public void exitArguments(TypeScriptParser.ArgumentsContext ctx) { exitNode("Arguments"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	public void enterArgumentList(TypeScriptParser.ArgumentListContext ctx) { enterNode("ArgumentList"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#argumentList}.
	 * @param ctx the parse tree
	 */
	public void exitArgumentList(TypeScriptParser.ArgumentListContext ctx) { exitNode("ArgumentList"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	public void enterArgument(TypeScriptParser.ArgumentContext ctx) { enterNode("Argument"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#argument}.
	 * @param ctx the parse tree
	 */
	public void exitArgument(TypeScriptParser.ArgumentContext ctx) { exitNode("Argument"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	public void enterExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) { enterNode("ExpressionSequence"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	public void exitExpressionSequence(TypeScriptParser.ExpressionSequenceContext ctx) { exitNode("ExpressionSequence"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#functionExpressionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionExpressionDeclaration(TypeScriptParser.FunctionExpressionDeclarationContext ctx) { enterNode("FunctionExpressionDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#functionExpressionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionExpressionDeclaration(TypeScriptParser.FunctionExpressionDeclarationContext ctx) { exitNode("FunctionExpressionDeclaration"); }
	/**
	 * Enter a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterTemplateStringExpression(TypeScriptParser.TemplateStringExpressionContext ctx) { enterNode("TemplateStringExpression"); }
	/**
	 * Exit a parse tree produced by the {@code TemplateStringExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitTemplateStringExpression(TypeScriptParser.TemplateStringExpressionContext ctx) { exitNode("TemplateStringExpression"); }
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterTernaryExpression(TypeScriptParser.TernaryExpressionContext ctx) { enterNode("TernaryExpression"); }
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitTernaryExpression(TypeScriptParser.TernaryExpressionContext ctx) { exitNode("TernaryExpression"); }
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterLogicalAndExpression(TypeScriptParser.LogicalAndExpressionContext ctx) { enterNode("LogicalAndExpression"); }
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitLogicalAndExpression(TypeScriptParser.LogicalAndExpressionContext ctx) { exitNode("LogicalAndExpression"); }
	/**
	 * Enter a parse tree produced by the {@code GeneratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorsExpression(TypeScriptParser.GeneratorsExpressionContext ctx) { enterNode("GeneratorsExpression"); }
	/**
	 * Exit a parse tree produced by the {@code GeneratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorsExpression(TypeScriptParser.GeneratorsExpressionContext ctx) { exitNode("GeneratorsExpression"); }
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterPreIncrementExpression(TypeScriptParser.PreIncrementExpressionContext ctx) { enterNode("PreIncrementExpression"); }
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitPreIncrementExpression(TypeScriptParser.PreIncrementExpressionContext ctx) { exitNode("PreIncrementExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterObjectLiteralExpression(TypeScriptParser.ObjectLiteralExpressionContext ctx) { enterNode("ObjectLiteralExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitObjectLiteralExpression(TypeScriptParser.ObjectLiteralExpressionContext ctx) { exitNode("ObjectLiteralExpression"); }
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterInExpression(TypeScriptParser.InExpressionContext ctx) { enterNode("InExpression"); }
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitInExpression(TypeScriptParser.InExpressionContext ctx) { exitNode("InExpression"); }
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterLogicalOrExpression(TypeScriptParser.LogicalOrExpressionContext ctx) { enterNode("LogicalOrExpression"); }
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitLogicalOrExpression(TypeScriptParser.LogicalOrExpressionContext ctx) { exitNode("LogicalOrExpression"); }
	/**
	 * Enter a parse tree produced by the {@code GenericTypes}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterGenericTypes(TypeScriptParser.GenericTypesContext ctx) { enterNode("GenericTypes"); }
	/**
	 * Exit a parse tree produced by the {@code GenericTypes}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitGenericTypes(TypeScriptParser.GenericTypesContext ctx) { exitNode("GenericTypes"); }
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterNotExpression(TypeScriptParser.NotExpressionContext ctx) { enterNode("NotExpression"); }
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitNotExpression(TypeScriptParser.NotExpressionContext ctx) { exitNode("NotExpression"); }
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterPreDecreaseExpression(TypeScriptParser.PreDecreaseExpressionContext ctx) { enterNode("PreDecreaseExpression"); }
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitPreDecreaseExpression(TypeScriptParser.PreDecreaseExpressionContext ctx) { exitNode("PreDecreaseExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) { enterNode("ArgumentsExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitArgumentsExpression(TypeScriptParser.ArgumentsExpressionContext ctx) { exitNode("ArgumentsExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterThisExpression(TypeScriptParser.ThisExpressionContext ctx) { enterNode("ThisExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitThisExpression(TypeScriptParser.ThisExpressionContext ctx) { exitNode("ThisExpression"); }
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterFunctionExpression(TypeScriptParser.FunctionExpressionContext ctx) { enterNode("FunctionExpression"); }
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitFunctionExpression(TypeScriptParser.FunctionExpressionContext ctx) { exitNode("FunctionExpression"); }
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterUnaryMinusExpression(TypeScriptParser.UnaryMinusExpressionContext ctx) { enterNode("UnaryMinusExpression"); }
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitUnaryMinusExpression(TypeScriptParser.UnaryMinusExpressionContext ctx) { exitNode("UnaryMinusExpression"); }
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAssignmentExpression(TypeScriptParser.AssignmentExpressionContext ctx) { enterNode("AssignmentExpression"); }
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAssignmentExpression(TypeScriptParser.AssignmentExpressionContext ctx) { exitNode("AssignmentExpression"); }
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterPostDecreaseExpression(TypeScriptParser.PostDecreaseExpressionContext ctx) { enterNode("PostDecreaseExpression"); }
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitPostDecreaseExpression(TypeScriptParser.PostDecreaseExpressionContext ctx) { exitNode("PostDecreaseExpression"); }
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterTypeofExpression(TypeScriptParser.TypeofExpressionContext ctx) { enterNode("TypeofExpression"); }
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitTypeofExpression(TypeScriptParser.TypeofExpressionContext ctx) { exitNode("TypeofExpression"); }
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterInstanceofExpression(TypeScriptParser.InstanceofExpressionContext ctx) { enterNode("InstanceofExpression"); }
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitInstanceofExpression(TypeScriptParser.InstanceofExpressionContext ctx) { exitNode("InstanceofExpression"); }
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterUnaryPlusExpression(TypeScriptParser.UnaryPlusExpressionContext ctx) { enterNode("UnaryPlusExpression"); }
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitUnaryPlusExpression(TypeScriptParser.UnaryPlusExpressionContext ctx) { exitNode("UnaryPlusExpression"); }
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterDeleteExpression(TypeScriptParser.DeleteExpressionContext ctx) { enterNode("DeleteExpression"); }
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitDeleteExpression(TypeScriptParser.DeleteExpressionContext ctx) { exitNode("DeleteExpression"); }
	/**
	 * Enter a parse tree produced by the {@code GeneratorsFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterGeneratorsFunctionExpression(TypeScriptParser.GeneratorsFunctionExpressionContext ctx) { enterNode("GeneratorsFunctionExpression"); }
	/**
	 * Exit a parse tree produced by the {@code GeneratorsFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitGeneratorsFunctionExpression(TypeScriptParser.GeneratorsFunctionExpressionContext ctx) { exitNode("GeneratorsFunctionExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterArrowFunctionExpression(TypeScriptParser.ArrowFunctionExpressionContext ctx) { enterNode("ArrowFunctionExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitArrowFunctionExpression(TypeScriptParser.ArrowFunctionExpressionContext ctx) { exitNode("ArrowFunctionExpression"); }
	/**
	 * Enter a parse tree produced by the {@code IteratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterIteratorsExpression(TypeScriptParser.IteratorsExpressionContext ctx) { enterNode("IteratorsExpression"); }
	/**
	 * Exit a parse tree produced by the {@code IteratorsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitIteratorsExpression(TypeScriptParser.IteratorsExpressionContext ctx) { exitNode("IteratorsExpression"); }
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterEqualityExpression(TypeScriptParser.EqualityExpressionContext ctx) { enterNode("EqualityExpression"); }
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitEqualityExpression(TypeScriptParser.EqualityExpressionContext ctx) { exitNode("EqualityExpression"); }
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterBitXOrExpression(TypeScriptParser.BitXOrExpressionContext ctx) { enterNode("BitXOrExpression"); }
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitBitXOrExpression(TypeScriptParser.BitXOrExpressionContext ctx) { exitNode("BitXOrExpression"); }
	/**
	 * Enter a parse tree produced by the {@code CastAsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterCastAsExpression(TypeScriptParser.CastAsExpressionContext ctx) { enterNode("CastAsExpression"); }
	/**
	 * Exit a parse tree produced by the {@code CastAsExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitCastAsExpression(TypeScriptParser.CastAsExpressionContext ctx) { exitNode("CastAsExpression"); }
	/**
	 * Enter a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterSuperExpression(TypeScriptParser.SuperExpressionContext ctx) { enterNode("SuperExpression"); }
	/**
	 * Exit a parse tree produced by the {@code SuperExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitSuperExpression(TypeScriptParser.SuperExpressionContext ctx) { exitNode("SuperExpression"); }
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterMultiplicativeExpression(TypeScriptParser.MultiplicativeExpressionContext ctx) { enterNode("MultiplicativeExpression"); }
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitMultiplicativeExpression(TypeScriptParser.MultiplicativeExpressionContext ctx) { exitNode("MultiplicativeExpression"); }
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterBitShiftExpression(TypeScriptParser.BitShiftExpressionContext ctx) { enterNode("BitShiftExpression"); }
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitBitShiftExpression(TypeScriptParser.BitShiftExpressionContext ctx) { exitNode("BitShiftExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterParenthesizedExpression(TypeScriptParser.ParenthesizedExpressionContext ctx) { enterNode("ParenthesizedExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitParenthesizedExpression(TypeScriptParser.ParenthesizedExpressionContext ctx) { exitNode("ParenthesizedExpression"); }
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAdditiveExpression(TypeScriptParser.AdditiveExpressionContext ctx) { enterNode("AdditiveExpression"); }
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAdditiveExpression(TypeScriptParser.AdditiveExpressionContext ctx) { exitNode("AdditiveExpression"); }
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterRelationalExpression(TypeScriptParser.RelationalExpressionContext ctx) { enterNode("RelationalExpression"); }
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitRelationalExpression(TypeScriptParser.RelationalExpressionContext ctx) { exitNode("RelationalExpression"); }
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterPostIncrementExpression(TypeScriptParser.PostIncrementExpressionContext ctx) { enterNode("PostIncrementExpression"); }
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitPostIncrementExpression(TypeScriptParser.PostIncrementExpressionContext ctx) { exitNode("PostIncrementExpression"); }
	/**
	 * Enter a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterYieldExpression(TypeScriptParser.YieldExpressionContext ctx) { enterNode("YieldExpression"); }
	/**
	 * Exit a parse tree produced by the {@code YieldExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitYieldExpression(TypeScriptParser.YieldExpressionContext ctx) { exitNode("YieldExpression"); }
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterBitNotExpression(TypeScriptParser.BitNotExpressionContext ctx) { enterNode("BitNotExpression"); }
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitBitNotExpression(TypeScriptParser.BitNotExpressionContext ctx) { exitNode("BitNotExpression"); }
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterNewExpression(TypeScriptParser.NewExpressionContext ctx) { enterNode("NewExpression"); }
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitNewExpression(TypeScriptParser.NewExpressionContext ctx) { exitNode("NewExpression"); }
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterLiteralExpression(TypeScriptParser.LiteralExpressionContext ctx) { enterNode("LiteralExpression"); }
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitLiteralExpression(TypeScriptParser.LiteralExpressionContext ctx) { exitNode("LiteralExpression"); }
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterArrayLiteralExpression(TypeScriptParser.ArrayLiteralExpressionContext ctx) { enterNode("ArrayLiteralExpression"); }
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitArrayLiteralExpression(TypeScriptParser.ArrayLiteralExpressionContext ctx) { exitNode("ArrayLiteralExpression"); }
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) { enterNode("MemberDotExpression"); }
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitMemberDotExpression(TypeScriptParser.MemberDotExpressionContext ctx) { exitNode("MemberDotExpression"); }
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterMemberIndexExpression(TypeScriptParser.MemberIndexExpressionContext ctx) { enterNode("MemberIndexExpression"); }
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitMemberIndexExpression(TypeScriptParser.MemberIndexExpressionContext ctx) { exitNode("MemberIndexExpression"); }
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterIdentifierExpression(TypeScriptParser.IdentifierExpressionContext ctx) { enterNode("IdentifierExpression"); }
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitIdentifierExpression(TypeScriptParser.IdentifierExpressionContext ctx) { exitNode("IdentifierExpression"); }
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterBitAndExpression(TypeScriptParser.BitAndExpressionContext ctx) { enterNode("BitAndExpression"); }
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitBitAndExpression(TypeScriptParser.BitAndExpressionContext ctx) { exitNode("BitAndExpression"); }
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterBitOrExpression(TypeScriptParser.BitOrExpressionContext ctx) { enterNode("BitOrExpression"); }
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitBitOrExpression(TypeScriptParser.BitOrExpressionContext ctx) { exitNode("BitOrExpression"); }
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAssignmentOperatorExpression(TypeScriptParser.AssignmentOperatorExpressionContext ctx) { enterNode("AssignmentOperatorExpression"); }
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAssignmentOperatorExpression(TypeScriptParser.AssignmentOperatorExpressionContext ctx) { exitNode("AssignmentOperatorExpression"); }
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void enterVoidExpression(TypeScriptParser.VoidExpressionContext ctx) { enterNode("VoidExpression"); }
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link TypeScriptParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	public void exitVoidExpression(TypeScriptParser.VoidExpressionContext ctx) { exitNode("VoidExpression"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#asExpression}.
	 * @param ctx the parse tree
	 */
	public void enterAsExpression(TypeScriptParser.AsExpressionContext ctx) { enterNode("AsExpression"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#asExpression}.
	 * @param ctx the parse tree
	 */
	public void exitAsExpression(TypeScriptParser.AsExpressionContext ctx) { exitNode("AsExpression"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void enterArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) { enterNode("ArrowFunctionDeclaration"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	public void exitArrowFunctionDeclaration(TypeScriptParser.ArrowFunctionDeclarationContext ctx) { exitNode("ArrowFunctionDeclaration"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	public void enterArrowFunctionParameters(TypeScriptParser.ArrowFunctionParametersContext ctx) { enterNode("ArrowFunctionParameters"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionParameters}.
	 * @param ctx the parse tree
	 */
	public void exitArrowFunctionParameters(TypeScriptParser.ArrowFunctionParametersContext ctx) { exitNode("ArrowFunctionParameters"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	public void enterArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) { enterNode("ArrowFunctionBody"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arrowFunctionBody}.
	 * @param ctx the parse tree
	 */
	public void exitArrowFunctionBody(TypeScriptParser.ArrowFunctionBodyContext ctx) { exitNode("ArrowFunctionBody"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	public void enterAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx) { enterNode("AssignmentOperator"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	public void exitAssignmentOperator(TypeScriptParser.AssignmentOperatorContext ctx) { exitNode("AssignmentOperator"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	public void enterLiteral(TypeScriptParser.LiteralContext ctx) { enterNode("Literal"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	public void exitLiteral(TypeScriptParser.LiteralContext ctx) { exitNode("Literal"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	public void enterTemplateStringLiteral(TypeScriptParser.TemplateStringLiteralContext ctx) { enterNode("TemplateStringLiteral"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#templateStringLiteral}.
	 * @param ctx the parse tree
	 */
	public void exitTemplateStringLiteral(TypeScriptParser.TemplateStringLiteralContext ctx) { exitNode("TemplateStringLiteral"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	public void enterTemplateStringAtom(TypeScriptParser.TemplateStringAtomContext ctx) { enterNode("TemplateStringAtom"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#templateStringAtom}.
	 * @param ctx the parse tree
	 */
	public void exitTemplateStringAtom(TypeScriptParser.TemplateStringAtomContext ctx) { exitNode("TemplateStringAtom"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	public void enterNumericLiteral(TypeScriptParser.NumericLiteralContext ctx) { enterNode("NumericLiteral"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	public void exitNumericLiteral(TypeScriptParser.NumericLiteralContext ctx) { exitNode("NumericLiteral"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	public void enterIdentifierName(TypeScriptParser.IdentifierNameContext ctx) { enterNode("IdentifierName"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierName}.
	 * @param ctx the parse tree
	 */
	public void exitIdentifierName(TypeScriptParser.IdentifierNameContext ctx) { exitNode("IdentifierName"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	public void enterIdentifierOrKeyWord(TypeScriptParser.IdentifierOrKeyWordContext ctx) { enterNode("IdentifierOrKeyWord"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#identifierOrKeyWord}.
	 * @param ctx the parse tree
	 */
	public void exitIdentifierOrKeyWord(TypeScriptParser.IdentifierOrKeyWordContext ctx) { exitNode("IdentifierOrKeyWord"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	public void enterReservedWord(TypeScriptParser.ReservedWordContext ctx) { enterNode("ReservedWord"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	public void exitReservedWord(TypeScriptParser.ReservedWordContext ctx) { exitNode("ReservedWord"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	public void enterKeyword(TypeScriptParser.KeywordContext ctx) { enterNode("Keyword"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#keyword}.
	 * @param ctx the parse tree
	 */
	public void exitKeyword(TypeScriptParser.KeywordContext ctx) { exitNode("Keyword"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	public void enterGetter(TypeScriptParser.GetterContext ctx) { enterNode("Getter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#getter}.
	 * @param ctx the parse tree
	 */
	public void exitGetter(TypeScriptParser.GetterContext ctx) { exitNode("Getter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	public void enterSetter(TypeScriptParser.SetterContext ctx) { enterNode("Setter"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#setter}.
	 * @param ctx the parse tree
	 */
	public void exitSetter(TypeScriptParser.SetterContext ctx) { exitNode("Setter"); }
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	public void enterEos(TypeScriptParser.EosContext ctx) { enterNode("Eos"); }
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	public void exitEos(TypeScriptParser.EosContext ctx) { exitNode("Eos"); }

    public void enterEveryRule(ParserRuleContext c) {    }
    public void exitEveryRule(ParserRuleContext c) {}
    public void visitErrorNode(ErrorNode node) {}
    public void visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text.matches("^[a-zA-Z0-9_]*$"))
        {
            sexpr.append("{");
            sexpr.append(node.getText());
            sexpr.append("}");
        }
        
    }

    public void enterNode(String node) {
        sexpr.append("(");
        sexpr.append(node);
    }

    public void exitNode(String node) {
        sexpr.append(")");
    }

    public String result() {
        return sexpr.toString();
    }

    private StringBuilder sexpr = new StringBuilder();
    //private Stack<String> stack = new Stack<String>();
}