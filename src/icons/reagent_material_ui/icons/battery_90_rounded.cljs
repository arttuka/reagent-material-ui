(ns reagent-material-ui.icons.battery-90-rounded
  "Imports @material-ui/icons/Battery90Rounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def battery-90-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 5.33C17 4.6 16.4 4 15.67 4H14V3c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1v1H8.33C7.6 4 7 4.6 7 5.33V8h10V5.33z", "fillOpacity" ".3"}) (e "path" #js {"d" "M7 8v12.67C7 21.4 7.6 22 8.33 22h7.33c.74 0 1.34-.6 1.34-1.33V8H7z"}))
                                         "Battery90Rounded"))
