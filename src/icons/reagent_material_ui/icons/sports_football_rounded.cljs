(ns reagent-material-ui.icons.sports-football-rounded
  "Imports @material-ui/icons/SportsFootballRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-football-rounded (create-svg-icon (e "path" #js {"d" "M3.02 15.62c-.08 2.42.32 4.34.67 4.69s2.28.76 4.69.67l-5.36-5.36zM13.08 3.28c-2.33.42-4.79 1.34-6.62 3.18s-2.76 4.29-3.18 6.62l7.63 7.63c2.34-.41 4.79-1.34 6.62-3.18s2.76-4.29 3.18-6.62l-7.63-7.63zm1.72 7.32l-4.2 4.2c-.39.39-1.01.39-1.4 0s-.39-1.01 0-1.4l4.2-4.2c.39-.39 1.01-.39 1.4 0s.39 1.01 0 1.4zM20.98 8.38c.08-2.42-.32-4.34-.67-4.69s-2.28-.76-4.69-.67l5.36 5.36z"})
                                              "SportsFootballRounded"))
