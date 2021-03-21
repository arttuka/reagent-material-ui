(ns reagent-material-ui.icons.domain-verification-sharp
  "Imports @material-ui/icons/DomainVerificationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def domain-verification-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.6 10.88l-1.42-1.42-4.24 4.25-2.12-2.13L7.4 13l3.54 3.54z"}) (e "path" #js {"d" "M3 4v16h18V4H3zm16 14H5V8h14v10z"}))
                                                "DomainVerificationSharp"))
