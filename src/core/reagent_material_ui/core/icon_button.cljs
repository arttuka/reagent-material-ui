(ns reagent-material-ui.core.icon-button
  "Imports @material-ui/core/IconButton as a Reagent component.
   Original documentation is at https://material-ui.com/api/icon-button/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/IconButton" :as IconButton]))

(def icon-button (adapt-react-class (or (.-default IconButton) (.-IconButton IconButton)) "mui-icon-button"))
