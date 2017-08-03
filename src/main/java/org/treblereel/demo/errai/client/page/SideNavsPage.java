package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialPanel;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.treblereel.demo.errai.client.dto.DemoImageDTO;
import org.treblereel.demo.errai.client.dto.DemoImagePanel;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/2/17.
 */
@Singleton
@Templated
@Page(path = "sidenavs")
public class SideNavsPage {

    @Inject
    @DataField
    MaterialPanel typePanel;

    @PostConstruct
    public void init(){

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Fixed Sidenav", "It is the default type for Sidenav component, which has a permanent structure and opened by default.",
                "https://i.imgur.com/FG8zdzn.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Drawer Sidenav", "It's a persistent type of sidenav which can be opened (Adds also an overlay on top of the page) / closed. This type of sidenav is hidden by default.",
                "https://i.imgur.com/IgfPnXo.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Drawer with Header Sidenav", "The same structure as the Drawer Sidenav, the only difference is that the it overlays together with the header navbar.",
                "https://i.imgur.com/yZQH1iq.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Push Sidenav", "It's a persistent type of sidenav which can be opened / closed. It pushes the entire page including the header / footer / main components when opening the sidenav.",
                "https://i.imgur.com/rIktoKt.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Push with Header Sidenav", "The same structure as the Push Sidenav, the only difference is that the header is fixed and cannot push , only the main / footer components are pushed when opening the sidenav.",
                "https://i.imgur.com/AtGh0Vb.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Card Sidenav", "It adds a delightful shadow on this sidenav container, this sidenav is good for few sidenav link items.",
                "https://i.imgur.com/DjqKg1X.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Mini Sidenav", "Mini Variant / Icon Only sidenav is good for wide page content plus a section wherein you can easily navigate the sidenav menu.",
                "https://i.imgur.com/XMtfBsr.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Mini Expandable Sidenav", "Added a little variation from icon only to drawer sidenav.",
                "https://i.imgur.com/ZR0HsfA.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Edge (Right)", "Sidenavs also can be placed on the RIGHT Edge of the page for other usecase.",
                "https://i.imgur.com/FuYq68d.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("Collapsible Items", "Using collapsible component you can add easily a sub menu into your sidenav.",
                "http://i.imgur.com/aTrfz70.gif")));

        typePanel.add(new DemoImagePanel(new DemoImageDTO("SideNav Content", "A component inside SideNav which you can place any plain contents like input fields, picture, labesl and description.",
                "http://i.imgur.com/21DoL6L.gif")));

    }

}
