(ns reagent-material-ui.icons.eleven-mp-two-tone
  "Imports @material-ui/icons/ElevenMpTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def eleven-mp-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 19h14V5H5v14zm13-5.5V16c0 .55-.45 1-1 1h-2v1.5h-1.5v-6H17c.55 0 1 .45 1 1zm-5-8h3v6h-1.5V7H13V5.5zm-5 0h3v6H9.5V7H8V5.5zm-2 8c0-.55.45-1 1-1h4.5c.55 0 1 .45 1 1v5H11V14h-1v3H8.5v-3h-1v4.5H6v-5z", "opacity" ".3"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z", "opacity" ".3"}) (e "path" #js {"d" "M7.5 14h1v3H10v-3h1v4.5h1.5v-5c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1v5h1.5V14zm6 4.5H15V17h2c.55 0 1-.45 1-1v-2.5c0-.55-.45-1-1-1h-3.5v6zM15 14h1.5v1.5H15V14z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M9.5 11.5H11v-6H8V7h1.5zm5 0H16v-6h-3V7h1.5z"}))
                                         "ElevenMpTwoTone"))
