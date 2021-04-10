(ns reagent-material-ui.icons.cloud-queue-two-tone
  "Imports @material-ui/icons/CloudQueueTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cloud-queue-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 12h-1.5v-.5C17.5 8.46 15.04 6 12 6c-2.52 0-4.63 1.69-5.29 4H6c-2.21 0-4 1.79-4 4s1.79 4 4 4h13c1.66 0 3-1.34 3-3s-1.34-3-3-3z", "opacity" ".3"}) (e "path" #js {"d" "M19.35 10.04C18.67 6.59 15.64 4 12 4 9.11 4 6.6 5.64 5.35 8.04 2.34 8.36 0 10.91 0 14c0 3.31 2.69 6 6 6h13c2.76 0 5-2.24 5-5 0-2.64-2.05-4.78-4.65-4.96zM19 18H6c-2.21 0-4-1.79-4-4s1.79-4 4-4h.71C7.37 7.69 9.48 6 12 6c3.04 0 5.5 2.46 5.5 5.5v.5H19c1.66 0 3 1.34 3 3s-1.34 3-3 3z"}))
                                           "CloudQueueTwoTone"))
