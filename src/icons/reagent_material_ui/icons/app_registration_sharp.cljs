(ns reagent-material-ui.icons.app-registration-sharp
  "Imports @material-ui/icons/AppRegistrationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def app-registration-sharp (create-svg-icon (e "path" #js {"d" "M10 4h4v4h-4zM4 16h4v4H4zm0-6h4v4H4zm0-6h4v4H4zm12 0h4v4h-4zm-5 13.86V20h2.1l5.98-5.97-2.12-2.12zm3-5.83V10h-4v4h2.03zm3.6713-.8243 1.4142-1.4143 2.1214 2.1214-1.4143 1.4142z"})
                                             "AppRegistrationSharp"))
