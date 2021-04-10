(ns reagent-material-ui.icons.double-arrow-rounded
  "Imports @material-ui/icons/DoubleArrowRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def double-arrow-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20.08 11.42l-4.04-5.65c-.34-.48-.89-.77-1.48-.77-1.49 0-2.35 1.68-1.49 2.89L16 12l-2.93 4.11c-.87 1.21 0 2.89 1.49 2.89.59 0 1.15-.29 1.49-.77l4.04-5.65c.24-.35.24-.81-.01-1.16z"}) (e "path" #js {"d" "M13.08 11.42L9.05 5.77C8.7 5.29 8.15 5 7.56 5 6.07 5 5.2 6.68 6.07 7.89L9 12l-2.93 4.11C5.2 17.32 6.07 19 7.56 19c.59 0 1.15-.29 1.49-.77l4.04-5.65c.24-.35.24-.81-.01-1.16z"}))
                                           "DoubleArrowRounded"))
