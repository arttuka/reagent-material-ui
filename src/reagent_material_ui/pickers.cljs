(ns reagent-material-ui.pickers
  "Imports all components from @material-ui/pickers as Reagent components.
   Original documentation is at https://material-ui-pickers.dev/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui-pickers]))

(def date-picker (adapt-react-class (.-DatePicker js/MaterialUIPickers) "mui-date-picker"))
(def keyboard-date-picker (adapt-react-class (.-KeyboardDatePicker js/MaterialUIPickers) "mui-keyboard-date-picker"))
(def time-picker (adapt-react-class (.-TimePicker js/MaterialUIPickers) "mui-time-picker"))
(def keyboard-time-picker (adapt-react-class (.-KeyboardTimePicker js/MaterialUIPickers) "mui-keyboard-time-picker"))
(def date-time-picker (adapt-react-class (.-DateTimePicker js/MaterialUIPickers) "mui-date-time-picker"))
(def keyboard-date-time-picker (adapt-react-class (.-KeyboardDateTimePicker js/MaterialUIPickers) "mui-keyboard-date-time-picker"))
(def calendar (adapt-react-class (.-Calendar js/MaterialUIPickers) "mui-calendar"))
(def day (adapt-react-class (.-Day js/MaterialUIPickers) "mui-day"))
(def time-picker-view (adapt-react-class (.-TimePickerView js/MaterialUIPickers) "mui-time-picker-view"))
(def clock-view (adapt-react-class (.-ClockView js/MaterialUIPickers) "mui-clock-view"))
(def clock (adapt-react-class (.-Clock js/MaterialUIPickers) "mui-clock"))
(def picker (adapt-react-class (.-Picker js/MaterialUIPickers) "mui-picker"))
(def mui-pickers-utils-provider (adapt-react-class (.-MuiPickersUtilsProvider js/MaterialUIPickers) "mui-pickers-utils-provider"))
(def mui-pickers-context (adapt-react-class (.-MuiPickersContext js/MaterialUIPickers) "mui-pickers-context"))
