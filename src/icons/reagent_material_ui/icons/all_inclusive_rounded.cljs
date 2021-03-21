(ns reagent-material-ui.icons.all-inclusive-rounded
  "Imports @material-ui/icons/AllInclusiveRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def all-inclusive-rounded (create-svg-icon (e "path" #js {"d" "M8.34 10.05c.38.34.96.34 1.34 0 .44-.4.44-1.09 0-1.49C9.12 8.07 7.83 6.5 5.5 6.5 2.47 6.5 0 8.97 0 12s2.47 5.5 5.5 5.5c1.21 0 2.38-.45 3.28-1.26l7.77-6.99c.54-.48 1.23-.75 1.95-.75 1.93 0 3.5 1.57 3.5 3.5s-1.57 3.5-3.5 3.5c-1.25 0-1.81-.62-2.84-1.55-.38-.34-.96-.34-1.34 0-.44.4-.44 1.09 0 1.49.55.5 1.85 2.07 4.18 2.07 3.03 0 5.5-2.47 5.5-5.5s-2.47-5.5-5.5-5.5c-1.21 0-2.38.45-3.28 1.26l-7.77 6.99c-.54.47-1.23.74-1.95.74C3.57 15.5 2 13.93 2 12s1.57-3.5 3.5-3.5c1.25 0 1.81.62 2.84 1.55z"})
                                            "AllInclusiveRounded"))
