(ns reagent-mui.material.popover
  "Imports @mui/material/Popover as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/popover/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Popover" :as MuiPopover]))

(def popover (adapt-react-class (.-default MuiPopover) "mui-popover"))
