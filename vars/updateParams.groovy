def call(script) {
    println script.metaClass.methods.name.unique()
    println script.dump()
    println script.getClass().getInterfaces()
    println script.getClass().getDeclaredFields()
    println script.getClass().getDeclaredMethods()
}