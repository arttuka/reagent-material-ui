(ns reagent-material-ui.core.tab-scroll-button
  "Imports @material-ui/core/TabScrollButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/tab-scroll-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/TabScrollButton" :as MuiTabScrollButton]))

(def tab-scroll-button (adapt-react-class (or (.-default MuiTabScrollButton) (.-TabScrollButton MuiTabScrollButton)) "mui-tab-scroll-button"))
