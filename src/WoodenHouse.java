public class WoodencoatHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
    public exteriorDecor(){
        System.out.println("Decorate the exterior of the building");
        // we cant have only exterior without interior
    }
    
    public void interiorDecor(){
        System.out.println("Decorate the interior of the building");

}
