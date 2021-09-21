(ns reagent-mui.material.tab-scroll-button
  "Imports @mui/material/TabScrollButton as a Reagent component.
   Original documentation is at https://mui.com/api/tab-scroll-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/TabScrollButton" :as MuiTabScrollButton]))

(def tab-scroll-button (adapt-react-class (.-default MuiTabScrollButton) "mui-tab-scroll-button"))
