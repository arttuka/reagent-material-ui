(ns reagent-material-ui.icons.next-plan-two-tone
  "Imports @material-ui/icons/NextPlanTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def next-plan-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4c-4.42 0-8 3.58-8 8s3.58 8 8 8 8-3.58 8-8-3.58-8-8-8zm1 10l2.26-2.26C14.35 10.68 13.01 10 11.5 10c-2.37 0-4.35 1.66-4.86 3.88l-.96-.32C6.32 10.95 8.68 9 11.5 9c1.78 0 3.37.79 4.47 2.03L18 9v5h-5z", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}) (e "path" #js {"d" "M15.97 11.03C14.87 9.79 13.28 9 11.5 9c-2.82 0-5.18 1.95-5.82 4.56l.96.32C7.15 11.66 9.13 10 11.5 10c1.51 0 2.85.68 3.76 1.74L13 14h5V9l-2.03 2.03z"}))
                                         "NextPlanTwoTone"))
