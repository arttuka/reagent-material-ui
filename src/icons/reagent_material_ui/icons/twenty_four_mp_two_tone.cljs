(ns reagent-material-ui.icons.twenty-four-mp-two-tone
  "Imports @material-ui/icons/TwentyFourMpTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def twenty-four-mp-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zm13-3c0 .55-.45 1-1 1h-2v1.5h-1.5v-6H17c.55 0 1 .45 1 1V16zM13 5.5h1.5v3H16v-3h1.5v3h1V10h-1v1.5H16V10h-3V5.5zM6.5 9c0-.55.45-1 1-1h2V7h-3V5.5H10c.55 0 1 .45 1 1V8c0 .55-.45 1-1 1H8v1h3v1.5H6.5V9zM6 13.5c0-.55.45-1 1-1h4.5c.55 0 1 .45 1 1v5H11V14h-1v3H8.5v-3h-1v4.5H6v-5z", "opacity" ".3"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z", "opacity" ".3"}) (e "path" #js {"d" "M7.5 14h1v3H10v-3h1v4.5h1.5v-5c0-.55-.45-1-1-1H7c-.55 0-1 .45-1 1v5h1.5V14zm9.5-1.5h-3.5v6H15V17h2c.55 0 1-.45 1-1v-2.5c0-.55-.45-1-1-1zm-.5 3H15V14h1.5v1.5z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M11 10H8V9h2c.55 0 1-.45 1-1V6.5c0-.55-.45-1-1-1H6.5V7h3v1h-2c-.55 0-1 .45-1 1v2.5H11V10zm5 1.5h1.5V10h1V8.5h-1v-3H16v3h-1.5v-3H13V10h3z"})]
                                              "TwentyFourMpTwoTone"))