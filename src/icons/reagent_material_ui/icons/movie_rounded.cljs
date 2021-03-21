(ns reagent-material-ui.icons.movie-rounded
  "Imports @material-ui/icons/MovieRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def movie-rounded (create-svg-icon (e "path" #js {"d" "M20 4h-3l2 4h-3l-2-4h-2l2 4h-3L9 4H7l2 4H6L4 4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2z"})
                                    "MovieRounded"))
