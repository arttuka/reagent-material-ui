(ns reagent-mui.x.pickers-layout
  "Imports @mui/x-date-pickers/PickersLayout as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/pickers-layout/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers/PickersLayout" :as MuiPickersLayout]))

(def pickers-layout (r/adapt-react-class MuiPickersLayout/PickersLayout))
