(ns reagent-material-ui.icons.skip-next-rounded
  "Imports @material-ui/icons/SkipNextRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-next-rounded (create-svg-icon (e "path" #js {"d" "M16 7v10c0 .55.45 1 1 1s1-.45 1-1V7c0-.55-.45-1-1-1s-1 .45-1 1zm-9.45 9.96l6.2-4.13c.59-.4.59-1.27 0-1.66l-6.2-4.13C5.89 6.59 5 7.07 5 7.87v8.26c0 .8.89 1.28 1.55.83z"})
                                        "SkipNextRounded"))
