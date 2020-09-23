(ns reagent-material-ui.icons.domain-verification-outlined
  "Imports @material-ui/icons/DomainVerificationOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def domain-verification-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.6 10.88l-1.42-1.42-4.24 4.25-2.12-2.13L7.4 13l3.54 3.54z"}) (e "path" #js {"d" "M19 4H5c-1.11 0-2 .9-2 2v12c0 1.1.89 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.89-2-2-2zm0 14H5V8h14v10z"}))
                                                   "DomainVerificationOutlined"))
