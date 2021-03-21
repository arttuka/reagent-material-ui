(ns reagent-material-ui.icons.domain-verification-two-tone
  "Imports @material-ui/icons/DomainVerificationTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def domain-verification-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 18h14V8H5v10zm3.82-6.42l2.12 2.12 4.24-4.24 1.41 1.41-5.66 5.66L7.4 13l1.42-1.42z", "opacity" ".3"}) (e "path" #js {"d" "M16.6 10.88l-1.42-1.42-4.24 4.25-2.12-2.13L7.4 13l3.54 3.54z"}) (e "path" #js {"d" "M19 4H5c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H5V8h14v10z"}))
                                                   "DomainVerificationTwoTone"))
