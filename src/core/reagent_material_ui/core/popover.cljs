(ns reagent-material-ui.core.popover
  "Imports @material-ui/core/Popover as a Reagent component.
   Original documentation is at https://material-ui.com/api/popover/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Popover" :as Popover]))

(def popover (adapt-react-class (or (.-default Popover) (.-Popover Popover)) "mui-popover"))
