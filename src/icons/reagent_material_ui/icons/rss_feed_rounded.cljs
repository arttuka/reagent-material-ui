(ns reagent-material-ui.icons.rss-feed-rounded
  "Imports @material-ui/icons/RssFeedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def rss-feed-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "19", "r" "2", "cx" "5"}) (e "path" #js {"d" "M4.35 7.06C10.99 7.7 16.3 13 16.93 19.64c.07.77.72 1.35 1.49 1.35.88 0 1.59-.76 1.5-1.63-.77-8.09-7.2-14.52-15.29-15.29C3.76 3.99 3 4.7 3 5.58c0 .77.58 1.41 1.35 1.48z"}) (e "path" #js {"d" "M3 11.62c0 .75.56 1.36 1.3 1.48 3.37.55 6.04 3.22 6.6 6.59.12.74.73 1.3 1.48 1.3.93 0 1.63-.84 1.48-1.75-.75-4.67-4.44-8.36-9.11-9.11-.91-.14-1.75.56-1.75 1.49z"}))
                                       "RssFeedRounded"))
