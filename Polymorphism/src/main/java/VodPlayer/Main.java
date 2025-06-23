package VodPlayer;

public class Main {
    public static void main(String[] args) {
        final String player=args[0];
        VodPlayer vodPlayer=null;
        if(player.equalsIgnoreCase("Netflix")){
            vodPlayer=new NetflixPlayer();
        }else if(player.equalsIgnoreCase("Giant")){
            vodPlayer=new HBOGoPlayer();
        }else if(player.equalsIgnoreCase("Microsoft")){
            vodPlayer=new DefaultPlayer();
        }

    }
}
