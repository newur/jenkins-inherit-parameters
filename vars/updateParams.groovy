def call(script) {
    println script.metaClass.methods.name.unique()
    println script.dump()
}