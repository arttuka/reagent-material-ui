(ns reagent-mui.material.popover
  "Imports @mui/material/Popover as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/popover/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Popover" :as MuiPopover]))

(def popover (r/adapt-react-class (.-default MuiPopover)))
