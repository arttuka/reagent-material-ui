(ns reagent-material-ui.icons.watch-rounded
  "Imports @material-ui/icons/WatchRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def watch-rounded (create-svg-icon (e "path" #js {"d" "M16.36 6.53l-.93-3.1C15.17 2.58 14.4 2 13.51 2h-3.02c-.89 0-1.66.58-1.92 1.43l-.93 3.1C6.03 7.81 5 9.78 5 12s1.03 4.19 2.64 5.47l.93 3.1c.26.85 1.03 1.43 1.92 1.43h3.02c.88 0 1.66-.58 1.92-1.43l.93-3.1C17.97 16.19 19 14.22 19 12s-1.03-4.19-2.64-5.47zM12 17c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})
                                    "WatchRounded"))
