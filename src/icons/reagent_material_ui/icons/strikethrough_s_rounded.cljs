(ns reagent-material-ui.icons.strikethrough-s-rounded
  "Imports @material-ui/icons/StrikethroughSRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def strikethrough-s-rounded (create-svg-icon (e "path" #js {"d" "M10.32 6.78c.48-.36 1.07-.54 1.76-.54.7 0 1.27.19 1.71.56.2.16.36.34.5.52.32.42.89.55 1.37.34.7-.3.96-1.18.49-1.78-.25-.32-.56-.63-.91-.92-.79-.63-1.86-.96-3.2-.96-.93 0-1.76.19-2.49.57-.83.42-1.45 1.02-1.87 1.78-.28.5-.43 1.07-.46 1.65h2.4c.04-.49.27-.9.7-1.22zm4.61 8.73c0 .68-.26 1.22-.79 1.62s-1.17.59-1.92.59c-.81 0-1.51-.27-2.09-.8-.33-.31-.61-.67-.83-1.08-.29-.54-.96-.75-1.52-.52-.65.26-.98 1.03-.66 1.65.4.78.94 1.42 1.63 1.93 1.01.73 2.15 1.1 3.42 1.1.84 0 1.66-.17 2.45-.49.79-.33 1.44-.83 1.96-1.51s.77-1.52.77-2.51c0-.55-.08-1.04-.23-1.49h-2.85c.44.4.66.9.66 1.51zM3 10c-.55 0-1 .45-1 1s.45 1 1 1h18c.55 0 1-.45 1-1s-.45-1-1-1H3z"})
                                              "StrikethroughSRounded"))
