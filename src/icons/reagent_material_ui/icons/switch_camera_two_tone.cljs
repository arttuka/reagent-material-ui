(ns reagent-material-ui.icons.switch-camera-two-tone
  "Imports @material-ui/icons/SwitchCameraTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def switch-camera-two-tone (create-svg-icon [(e "path" #js {"d" "M14.12 4H9.88L8.05 6H4v12h16V6h-4.05l-1.83-2zM15 15.5V13H9v2.5L5.5 12 9 8.5V11h6V8.5l3.5 3.5-3.5 3.5z", "opacity" ".3"}) (e "path" #js {"d" "M20 4h-3.17L15 2H9L7.17 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V6h4.05l1.83-2h4.24l1.83 2H20v12zm-5-7H9V8.5L5.5 12 9 15.5V13h6v2.5l3.5-3.5L15 8.5z"})]
                                             "SwitchCameraTwoTone"))
