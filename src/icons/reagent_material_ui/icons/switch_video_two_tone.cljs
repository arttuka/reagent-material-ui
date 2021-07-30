(ns reagent-material-ui.icons.switch-video-two-tone
  "Imports @material-ui/icons/SwitchVideoTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def switch-video-two-tone (create-svg-icon [(e "path" #js {"d" "M4 17h12V7H4v10zm4-8v2h4V9l3 3-3 3v-2H8v2l-3-3 3-3z", "opacity" ".3"}) (e "path" #js {"d" "M8 13h4v2l3-3-3-3v2H8V9l-3 3 3 3zm10-3.5V6c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1h14c.55 0 1-.45 1-1v-3.5l4 4v-13l-4 4zM16 17H4V7h12v10z"})]
                                            "SwitchVideoTwoTone"))
