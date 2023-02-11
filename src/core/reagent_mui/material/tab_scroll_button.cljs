(ns reagent-mui.material.tab-scroll-button
  "Imports @mui/material/TabScrollButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab-scroll-button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/TabScrollButton" :as MuiTabScrollButton]))

(def tab-scroll-button (r/adapt-react-class (.-default MuiTabScrollButton)))
