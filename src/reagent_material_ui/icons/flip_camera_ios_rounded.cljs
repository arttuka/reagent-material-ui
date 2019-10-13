(ns reagent-material-ui.icons.flip-camera-ios-rounded
  "Imports @material-ui/icons/FlipCameraIosRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def flip-camera-ios-rounded (create-svg-icon (e "path" #js {"d" "M20 5h-3.17l-1.24-1.35c-.37-.41-.91-.65-1.47-.65H9.88c-.56 0-1.1.24-1.48.65L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm-6.33 12.7c-.52.19-1.08.3-1.67.3-2.76 0-5-2.24-5-5H5l2.5-2.5L10 13H8c0 2.21 1.79 4 4 4 .46 0 .91-.08 1.32-.23.19-.07.39-.03.53.11.26.26.16.69-.18.82zm2.83-2.2L14 13h2c0-2.21-1.79-4-4-4-.46 0-.91.08-1.32.23-.19.07-.39.03-.53-.11-.26-.26-.16-.69.18-.82.52-.19 1.08-.3 1.67-.3 2.76 0 5 2.24 5 5h2l-2.5 2.5z"})
                                              "FlipCameraIosRounded"))
