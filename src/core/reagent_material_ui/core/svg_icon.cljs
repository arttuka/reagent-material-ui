(ns reagent-material-ui.core.svg-icon
  "Imports @material-ui/core/SvgIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/svg-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/SvgIcon" :as SvgIcon]))

(def svg-icon (adapt-react-class (or (.-default SvgIcon) (.-SvgIcon SvgIcon)) "mui-svg-icon"))
