def call(script) {
    println script.metaClass.methods.name.unique()
//    println script.dump()
//    println Arrays.asList(script.getClass().getInterfaces())
//    println Arrays.asList(script.getClass().getDeclaredFields())
//    println Arrays.asList(script.getClass().getDeclaredMethods())
    println script.env.HOME
    println script.params
    println script.currentBuild
    println script.currentBuild.rawBuild
    println script.currentBuild.rawBuild.parent
    println script.currentBuild.rawBuild.parent.parent
}