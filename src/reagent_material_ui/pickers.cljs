(ns reagent-material-ui.pickers
  "Imports all components from @material-ui/pickers as Reagent components.
   Original documentation is at https://material-ui-pickers.dev/ ."
  (:require [reagent.core :as r]
            [material-ui-pickers]))

(def date-picker (r/adapt-react-class (.-DatePicker js/MaterialUIPickers)))
(def keyboard-date-picker (r/adapt-react-class (.-KeyboardDatePicker js/MaterialUIPickers)))
(def time-picker (r/adapt-react-class (.-TimePicker js/MaterialUIPickers)))
(def keyboard-time-picker (r/adapt-react-class (.-KeyboardTimePicker js/MaterialUIPickers)))
(def date-time-picker (r/adapt-react-class (.-DateTimePicker js/MaterialUIPickers)))
(def keyboard-date-time-picker (r/adapt-react-class (.-KeyboardDateTimePicker js/MaterialUIPickers)))
(def calendar (r/adapt-react-class (.-Calendar js/MaterialUIPickers)))
(def day (r/adapt-react-class (.-Day js/MaterialUIPickers)))
(def time-picker-view (r/adapt-react-class (.-TimePickerView js/MaterialUIPickers)))
(def clock-view (r/adapt-react-class (.-ClockView js/MaterialUIPickers)))
(def clock (r/adapt-react-class (.-Clock js/MaterialUIPickers)))
(def picker (r/adapt-react-class (.-Picker js/MaterialUIPickers)))
(def mui-pickers-utils-provider (r/adapt-react-class (.-MuiPickersUtilsProvider js/MaterialUIPickers)))
(def mui-pickers-context (r/adapt-react-class (.-MuiPickersContext js/MaterialUIPickers)))
