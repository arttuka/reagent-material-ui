(ns reagent-material-ui.icons.local-laundry-service-rounded
  "Imports @material-ui/icons/LocalLaundryServiceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-laundry-service-rounded (create-svg-icon (e "path" #js {"d" "M9.64 16.36c1.3 1.3 3.42 1.3 4.72 0 1.3-1.3 1.3-3.42 0-4.72l-4.72 4.72zM18 2.01L6 2c-1.11 0-2 .89-2 2v16c0 1.11.89 2 2 2h12c1.11 0 2-.89 2-2V4c0-1.11-.89-1.99-2-1.99zM11 5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zM8 5c.55 0 1 .45 1 1s-.45 1-1 1-1-.45-1-1 .45-1 1-1zm4 14c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z"})
                                                    "LocalLaundryServiceRounded"))
