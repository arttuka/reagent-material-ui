(ns reagent-material-ui.icons.not-interested-two-tone
  "Imports @material-ui/icons/NotInterestedTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def not-interested-two-tone (create-svg-icon (e "path" #js {"d" "M12 22c5.52 0 10-4.48 10-10S17.52 2 12 2 2 6.48 2 12s4.48 10 10 10zm0-18c4.42 0 8 3.58 8 8 0 1.85-.63 3.55-1.69 4.9L7.1 5.69C8.45 4.63 10.15 4 12 4zM5.69 7.1 16.9 18.31C15.55 19.37 13.85 20 12 20c-4.42 0-8-3.58-8-8 0-1.85.63-3.55 1.69-4.9z"})
                                              "NotInterestedTwoTone"))
