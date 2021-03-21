(ns reagent-material-ui.icons.sports-football-rounded
  "Imports @material-ui/icons/SportsFootballRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-football-rounded (create-svg-icon (e "path" #js {"d" "M3.01 15.62c-.08 2.42.32 4.34.67 4.69.35.35 2.28.76 4.7.67l-5.37-5.36zM13.08 3.27c-2.33.42-4.8 1.34-6.63 3.18s-2.76 4.29-3.18 6.63l7.64 7.64c2.34-.41 4.8-1.34 6.63-3.18s2.76-4.29 3.18-6.63l-7.64-7.64zM9.2 14.8a.9839.9839 0 0 1 0-1.4l4.2-4.2c.39-.39 1.01-.39 1.4 0 .39.39.39 1.01 0 1.4l-4.2 4.2c-.39.39-1.02.39-1.4 0zm11.79-6.42c.08-2.42-.32-4.34-.67-4.69-.35-.35-2.28-.76-4.7-.67l5.37 5.36z"})
                                              "SportsFootballRounded"))
