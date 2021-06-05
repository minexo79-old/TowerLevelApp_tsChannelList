import tsChannelExtra.tsChannelList;
import tsChannelExtra.Channel;

import java.util.List;

public class gsonTry {

    public static void printChannelInfo(Channel c) {
        System.out.printf("ID:\t\t\t%d\n", c.Id);
        System.out.printf("API:\t\t%s\n", c.Api);
        System.out.printf("Max Depth:\t%d\n", c.MaxDepth);
    }

    public static void main(String[] args) {
        // Implement tsChannelList
        tsChannelList channelList = new tsChannelList();
        // Add
        if(channelList.AddChannel(1234567, "0", 150))
            System.out.println("Add OK.");
        else
            System.out.println("Add Fail.");

        if(channelList.AddChannel(7654321, "00AABBCCDD", 150))
            System.out.println("Add OK.");
        else
            System.out.println("Add Fail.");

        if(channelList.AddChannel(1234567, "JJKKCC", 150))
            System.out.println("Add OK.");
        else
            System.out.println("Add Fail.");

        // Remove
        if(channelList.RemoveChannel(1234567))
            System.out.println("Remove OK.");
        else
            System.out.println("Remove Fail.");

        if(channelList.RemoveChannel(8976541))
            System.out.println("Remove OK.");
        else
            System.out.println("Remove Fail.");

        // Traverse every channel
        List<Channel> ch = channelList.GetChannelList();
        for (Channel channel : ch)
            printChannelInfo(channel);

        // get specific channel
        Channel cch;
        if((cch = channelList.GetChannel(7654321)) != null)
            printChannelInfo(cch);
        else
            System.out.println("Get Fail.");

        if((cch = channelList.GetChannel(1234567)) != null)
            printChannelInfo(cch);
        else
            System.out.println("Get Fail.");
    }
}
