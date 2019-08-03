package com.ddapps.itarugby;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ddapps.itarugby.databinding.ActivityMainBindingImpl;
import com.ddapps.itarugby.databinding.AgendaRowBindingImpl;
import com.ddapps.itarugby.databinding.EventRowBindingImpl;
import com.ddapps.itarugby.databinding.FragmentAgendaBindingImpl;
import com.ddapps.itarugby.databinding.FragmentDisplayEventBindingImpl;
import com.ddapps.itarugby.databinding.FragmentDisplayGameBindingImpl;
import com.ddapps.itarugby.databinding.FragmentDisplayPlayerBindingImpl;
import com.ddapps.itarugby.databinding.FragmentHomeBindingImpl;
import com.ddapps.itarugby.databinding.FragmentLoginBindingImpl;
import com.ddapps.itarugby.databinding.FragmentNewGameBindingImpl;
import com.ddapps.itarugby.databinding.FragmentPlaceRegisterBindingImpl;
import com.ddapps.itarugby.databinding.FragmentRegisterPlayerBindingImpl;
import com.ddapps.itarugby.databinding.FragmentSponsorsBindingImpl;
import com.ddapps.itarugby.databinding.FragmentTeamBindingImpl;
import com.ddapps.itarugby.databinding.FragmentTrophyDisplayBindingImpl;
import com.ddapps.itarugby.databinding.FragmentTrophyRegisterBindingImpl;
import com.ddapps.itarugby.databinding.FragmentTrophyRoomBindingImpl;
import com.ddapps.itarugby.databinding.ItemSliderImageBindingImpl;
import com.ddapps.itarugby.databinding.NewEventFragmentBindingImpl;
import com.ddapps.itarugby.databinding.PlayerRowBindingImpl;
import com.ddapps.itarugby.databinding.RowItemTrophyRoomBindingImpl;
import com.ddapps.itarugby.databinding.RowSponsorsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_AGENDAROW = 2;

  private static final int LAYOUT_EVENTROW = 3;

  private static final int LAYOUT_FRAGMENTAGENDA = 4;

  private static final int LAYOUT_FRAGMENTDISPLAYEVENT = 5;

  private static final int LAYOUT_FRAGMENTDISPLAYGAME = 6;

  private static final int LAYOUT_FRAGMENTDISPLAYPLAYER = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTLOGIN = 9;

  private static final int LAYOUT_FRAGMENTNEWGAME = 10;

  private static final int LAYOUT_FRAGMENTPLACEREGISTER = 11;

  private static final int LAYOUT_FRAGMENTREGISTERPLAYER = 12;

  private static final int LAYOUT_FRAGMENTSPONSORS = 13;

  private static final int LAYOUT_FRAGMENTTEAM = 14;

  private static final int LAYOUT_FRAGMENTTROPHYDISPLAY = 15;

  private static final int LAYOUT_FRAGMENTTROPHYREGISTER = 16;

  private static final int LAYOUT_FRAGMENTTROPHYROOM = 17;

  private static final int LAYOUT_ITEMSLIDERIMAGE = 18;

  private static final int LAYOUT_NEWEVENTFRAGMENT = 19;

  private static final int LAYOUT_PLAYERROW = 20;

  private static final int LAYOUT_ROWITEMTROPHYROOM = 21;

  private static final int LAYOUT_ROWSPONSORS = 22;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(22);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.agenda_row, LAYOUT_AGENDAROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.event_row, LAYOUT_EVENTROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_agenda, LAYOUT_FRAGMENTAGENDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_display_event, LAYOUT_FRAGMENTDISPLAYEVENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_display_game, LAYOUT_FRAGMENTDISPLAYGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_display_player, LAYOUT_FRAGMENTDISPLAYPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_new_game, LAYOUT_FRAGMENTNEWGAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_place_register, LAYOUT_FRAGMENTPLACEREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_register_player, LAYOUT_FRAGMENTREGISTERPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_sponsors, LAYOUT_FRAGMENTSPONSORS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_team, LAYOUT_FRAGMENTTEAM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_trophy_display, LAYOUT_FRAGMENTTROPHYDISPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_trophy_register, LAYOUT_FRAGMENTTROPHYREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.fragment_trophy_room, LAYOUT_FRAGMENTTROPHYROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.item_slider_image, LAYOUT_ITEMSLIDERIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.new_event_fragment, LAYOUT_NEWEVENTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.player_row, LAYOUT_PLAYERROW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.row_item_trophy_room, LAYOUT_ROWITEMTROPHYROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ddapps.itarugby.R.layout.row_sponsors, LAYOUT_ROWSPONSORS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_AGENDAROW: {
          if ("layout/agenda_row_0".equals(tag)) {
            return new AgendaRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for agenda_row is invalid. Received: " + tag);
        }
        case  LAYOUT_EVENTROW: {
          if ("layout/event_row_0".equals(tag)) {
            return new EventRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for event_row is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAGENDA: {
          if ("layout/fragment_agenda_0".equals(tag)) {
            return new FragmentAgendaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_agenda is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDISPLAYEVENT: {
          if ("layout/fragment_display_event_0".equals(tag)) {
            return new FragmentDisplayEventBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_display_event is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDISPLAYGAME: {
          if ("layout/fragment_display_game_0".equals(tag)) {
            return new FragmentDisplayGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_display_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDISPLAYPLAYER: {
          if ("layout/fragment_display_player_0".equals(tag)) {
            return new FragmentDisplayPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_display_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWGAME: {
          if ("layout/fragment_new_game_0".equals(tag)) {
            return new FragmentNewGameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_game is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPLACEREGISTER: {
          if ("layout/fragment_place_register_0".equals(tag)) {
            return new FragmentPlaceRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_place_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERPLAYER: {
          if ("layout/fragment_register_player_0".equals(tag)) {
            return new FragmentRegisterPlayerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_player is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPONSORS: {
          if ("layout/fragment_sponsors_0".equals(tag)) {
            return new FragmentSponsorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sponsors is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEAM: {
          if ("layout/fragment_team_0".equals(tag)) {
            return new FragmentTeamBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_team is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTROPHYDISPLAY: {
          if ("layout/fragment_trophy_display_0".equals(tag)) {
            return new FragmentTrophyDisplayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trophy_display is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTROPHYREGISTER: {
          if ("layout/fragment_trophy_register_0".equals(tag)) {
            return new FragmentTrophyRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trophy_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTROPHYROOM: {
          if ("layout/fragment_trophy_room_0".equals(tag)) {
            return new FragmentTrophyRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trophy_room is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSLIDERIMAGE: {
          if ("layout/item_slider_image_0".equals(tag)) {
            return new ItemSliderImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_slider_image is invalid. Received: " + tag);
        }
        case  LAYOUT_NEWEVENTFRAGMENT: {
          if ("layout/new_event_fragment_0".equals(tag)) {
            return new NewEventFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for new_event_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PLAYERROW: {
          if ("layout/player_row_0".equals(tag)) {
            return new PlayerRowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for player_row is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWITEMTROPHYROOM: {
          if ("layout/row_item_trophy_room_0".equals(tag)) {
            return new RowItemTrophyRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_item_trophy_room is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSPONSORS: {
          if ("layout/row_sponsors_0".equals(tag)) {
            return new RowSponsorsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_sponsors is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "gameOpponents");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(22);

    static {
      sKeys.put("layout/activity_main_0", com.ddapps.itarugby.R.layout.activity_main);
      sKeys.put("layout/agenda_row_0", com.ddapps.itarugby.R.layout.agenda_row);
      sKeys.put("layout/event_row_0", com.ddapps.itarugby.R.layout.event_row);
      sKeys.put("layout/fragment_agenda_0", com.ddapps.itarugby.R.layout.fragment_agenda);
      sKeys.put("layout/fragment_display_event_0", com.ddapps.itarugby.R.layout.fragment_display_event);
      sKeys.put("layout/fragment_display_game_0", com.ddapps.itarugby.R.layout.fragment_display_game);
      sKeys.put("layout/fragment_display_player_0", com.ddapps.itarugby.R.layout.fragment_display_player);
      sKeys.put("layout/fragment_home_0", com.ddapps.itarugby.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", com.ddapps.itarugby.R.layout.fragment_login);
      sKeys.put("layout/fragment_new_game_0", com.ddapps.itarugby.R.layout.fragment_new_game);
      sKeys.put("layout/fragment_place_register_0", com.ddapps.itarugby.R.layout.fragment_place_register);
      sKeys.put("layout/fragment_register_player_0", com.ddapps.itarugby.R.layout.fragment_register_player);
      sKeys.put("layout/fragment_sponsors_0", com.ddapps.itarugby.R.layout.fragment_sponsors);
      sKeys.put("layout/fragment_team_0", com.ddapps.itarugby.R.layout.fragment_team);
      sKeys.put("layout/fragment_trophy_display_0", com.ddapps.itarugby.R.layout.fragment_trophy_display);
      sKeys.put("layout/fragment_trophy_register_0", com.ddapps.itarugby.R.layout.fragment_trophy_register);
      sKeys.put("layout/fragment_trophy_room_0", com.ddapps.itarugby.R.layout.fragment_trophy_room);
      sKeys.put("layout/item_slider_image_0", com.ddapps.itarugby.R.layout.item_slider_image);
      sKeys.put("layout/new_event_fragment_0", com.ddapps.itarugby.R.layout.new_event_fragment);
      sKeys.put("layout/player_row_0", com.ddapps.itarugby.R.layout.player_row);
      sKeys.put("layout/row_item_trophy_room_0", com.ddapps.itarugby.R.layout.row_item_trophy_room);
      sKeys.put("layout/row_sponsors_0", com.ddapps.itarugby.R.layout.row_sponsors);
    }
  }
}
