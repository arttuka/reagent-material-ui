(ns reagent-material-ui.icons.enhanced-encryption-sharp
  "Imports @material-ui/icons/EnhancedEncryptionSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def enhanced-encryption-sharp (create-svg-icon (e "path" #js {"d" "M20 8h-3V6.22c0-2.61-1.91-4.94-4.51-5.19C9.51.74 7 3.08 7 6v2H4v14h16V8zM8.9 6c0-1.71 1.39-3.1 3.1-3.1s3.1 1.39 3.1 3.1v2H8.9V6zM16 16h-3v3h-2v-3H8v-2h3v-3h2v3h3v2z"})
                                                "EnhancedEncryptionSharp"))
