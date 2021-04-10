(ns reagent-material-ui.icons.movie-two-tone
  "Imports @material-ui/icons/MovieTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def movie-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 10H5.76L4 6.47V18h16z", "opacity" ".3"}) (e "path" #js {"d" "M2.01 6L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V4h-4l2 4h-3l-2-4h-2l2 4h-3l-2-4H8l2 4H7L5 4H4c-1.1 0-1.99.9-1.99 2zM4 6.47L5.76 10H20v8H4V6.47z"}))
                                     "MovieTwoTone"))
