(ns reagent-mui.icons.domain-verification-sharp
  "Imports @mui/icons-material/DomainVerificationSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def domain-verification-sharp (create-svg-icon [(e "path" #js {"d" "m16.6 10.88-1.42-1.42-4.24 4.25-2.12-2.13L7.4 13l3.54 3.54z"}) (e "path" #js {"d" "M3 4v16h18V4H3zm16 14H5V8h14v10z"})]
                                                "DomainVerificationSharp"))
