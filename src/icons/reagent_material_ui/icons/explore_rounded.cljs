(ns reagent-material-ui.icons.explore-rounded
  "Imports @material-ui/icons/ExploreRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def explore-rounded (create-svg-icon (e "path" #js {"d" "M12 11c-.55 0-1 .45-1 1s.45 1 1 1 1-.45 1-1-.45-1-1-1zm0-9C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1.86 12.34l-6.62 3.08c-.42.2-.86-.24-.66-.66l3.08-6.62c.1-.21.27-.39.48-.48l6.62-3.08c.42-.2.86.24.66.66l-3.08 6.62c-.1.21-.27.38-.48.48z"})
                                      "ExploreRounded"))
