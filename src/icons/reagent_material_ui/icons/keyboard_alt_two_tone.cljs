(ns reagent-material-ui.icons.keyboard-alt-two-tone
  "Imports @material-ui/icons/KeyboardAltTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-alt-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 19h18V6H3v13zM17 8h2v2h-2V8zm0 4h2v2h-2v-2zm-4-4h2v2h-2V8zm0 4h2v2h-2v-2zM9 8h2v2H9V8zm0 4h2v2H9v-2zm-1 4h8v1H8v-1zM5 8h2v2H5V8zm0 4h2v2H5v-2z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H3c-1.1 0-2 .9-2 2v13c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 15H3V6h18v13z"}) (e "path" #js {"d" "M9 8h2v2H9zM5 8h2v2H5zm3 8h8v1H8zm5-8h2v2h-2zm-4 4h2v2H9zm-4 0h2v2H5zm8 0h2v2h-2zm4-4h2v2h-2zm0 4h2v2h-2z"}))
                                            "KeyboardAltTwoTone"))
