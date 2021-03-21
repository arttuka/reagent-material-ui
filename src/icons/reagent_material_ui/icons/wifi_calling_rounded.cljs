(ns reagent-material-ui.icons.wifi-calling-rounded
  "Imports @material-ui/icons/WifiCallingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wifi-calling-rounded (create-svg-icon (e "path" #js {"d" "M20.97 4.24C20.01 3.68 18.46 3 16.5 3c-1.95 0-3.5.67-4.45 1.23-.57.33-.67 1.11-.2 1.57l3.96 3.96c.39.39 1.03.39 1.42 0l3.95-3.95c.46-.47.35-1.24-.21-1.57zM15.63 14.4l-2.52 2.5c-2.5-1.43-4.57-3.5-6-6l2.5-2.52c.23-.24.33-.57.27-.9L9.13 3.8c-.09-.46-.5-.8-.98-.8H4c-.56 0-1.03.47-1 1.03.17 2.89 1.05 5.6 2.43 7.97 1.58 2.73 3.85 4.99 6.57 6.57 2.37 1.37 5.08 2.26 7.97 2.43.56.03 1.03-.44 1.03-1v-4.15c0-.48-.34-.89-.8-.98l-3.67-.73c-.33-.07-.67.03-.9.26z"})
                                           "WifiCallingRounded"))
