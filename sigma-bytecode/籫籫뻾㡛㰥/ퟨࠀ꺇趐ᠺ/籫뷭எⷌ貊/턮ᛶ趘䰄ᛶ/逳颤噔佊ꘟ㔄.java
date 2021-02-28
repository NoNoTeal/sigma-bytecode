public abstract class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u9033\u98a4\u5654\u4f4a\ua61f\u3504 {
    public void \u9033\u98a4\u5654\u4f4a\ua61f\u3504() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504)
            putfield:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u5140\u12b2\u8413\ud36e\u6b0d\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:HashMap<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>[expected:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>](HashMap<K, V>::<init>))
            
            try {
                invokespecial:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u4bc8\u6d99\u4c04\u74b1\uc7fe\u156b, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504)
            }
            catch (java.lang.Exception var_3_89) {
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u6b0d\u5f50\u8389\u8308\u5140(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        invokestatic:void(Preconditions::checkArgument, invokevirtual:boolean(String::matches, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9), ldc:String("^[a-z0-9_-]{3,15}$")), invokevirtual:String[expected:Object](StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)), ldc:String(" is not a valid sub-command name."))))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u7af6\u47c2\u5245\u392e\u8d90\u8258, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)))) {
            invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::put, getfield:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u5140\u12b2\u8413\ud36e\u6b0d\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504), invokevirtual:String(String::toLowerCase, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9), getstatic:Locale(Locale::ROOT)), p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)
            return:void()
        }
        
        athrow(initobject:Exception(Exception::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("ViaSubCommand ")), invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, p0:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)), ldc:String(" does already exists!")))))
    }
    
    public boolean \u7af6\u47c2\u5245\u392e\u8d90\u8258(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u5140\u12b2\u8413\ud36e\u6b0d\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504), invokevirtual:String[expected:Object](String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT))))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9 \u6198\u946b\ub18d\u4f52\ua562\u99f7(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(checkcast:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9.class, invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::get, getfield:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u5140\u12b2\u8413\ud36e\u6b0d\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504), invokevirtual:String[expected:Object](String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5140\u61a4\u1187\u927d\ub83f\u5bc4(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0, java.lang.String[] p1) {
        var_3_5F : int
        var_5_A2 : \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9
        var_7_D0 : boolean
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5F = and:int(ldc:int(1397632496), ldc:int(401420235))
        
        if (cmpeq:boolean(arraylength:int(p1:String[]), ldc:int(0))) {
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\ud12e\ud523\uc31c\u93a2\u40a9\u67e9, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25)
            return:boolean(and:int[expected:boolean](ldc:int(3985), ldc:int(-12180)))
        }
        
        do {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(33554432)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-596644325))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1650904447))
                
                if (invokevirtual:boolean(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u7af6\u47c2\u5245\u392e\u8d90\u8258, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, loadelement:String(p1:String[], and:int(ldc:int(5217), ldc:int(-5218))))) {
                    loopcontinue()
                }
                
                invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, ldc:String("&cThis command does not exist.")))
                invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\ud12e\ud523\uc31c\u93a2\u40a9\u67e9, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25)
                return:boolean(and:int[expected:boolean](ldc:int(-29052), ldc:int(12600)))
            }
        } while (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(256)), ldc:int(0)))
        
        var_5_A2 = invokevirtual:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u6198\u946b\ub18d\u4f52\ua562\u99f7, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, loadelement:String(p1:String[], and:int(ldc:int(-17745), ldc:int(17744))))
        
        if (invokespecial:boolean(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc84e\u4d85\ub6ab\uc3e3\u7330\u7049, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u6ec6\u8bb0\u6c52\u4f4a\u8350\u59ec, var_5_A2:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))) {
            var_7_D0 = invokevirtual:boolean(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u6ec6\u8aa5\ubded\ua6bd\u839e\u64f2, var_5_A2:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, checkcast:String[](java.lang.String[].class, invokestatic:String[](Arrays::copyOfRange, p1:String[], xor:int(ldc:int(-13824), ldc:int(-13823)), arraylength:int(p1:String[]))))
            
            if (logicalnot:boolean(var_7_D0:boolean)) {
                invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Usage: /viaversion ")), invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u1833\uc246\u4d85\ubefe\u647c\u16f6, var_5_A2:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))))
            }
            
            return:boolean(var_7_D0:boolean)
        }
        
        invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, ldc:String("&cYou are not allowed to use this command!")))
        return:boolean(and:int[expected:boolean](ldc:int(-21910), ldc:int(21909)))
    }
    
    public java.util.List<java.lang.String> \u52d3\ub113\u4c04\u873d\u4f4a\uc2bd(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0, java.lang.String[] p1) {
        var_3_EE : int
        var_5_65 : Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_6_6E : ArrayList<String>
        var_7_F6 : Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_8_159 : \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9
        var_7_210 : \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9
        var_9_23D : List<String>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_EE = and:int(ldc:int(-1708125367), ldc:int(-356516273))
        var_5_65 = invokespecial:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\ucfaf\uae5d\u5bc4\uc3e3\u3d64\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25)
        var_6_6E = initobject:ArrayList<String>(ArrayList<E>::<init>)
        
        if (cmpne:boolean(arraylength:int(p1:String[]), and:int(ldc:int(1095), ldc:int(14593)))) {
            goto(Label_0124)
        }
        
        if (invokevirtual:boolean(String::isEmpty, loadelement:String(p1:String[], and:int(ldc:int(2995), ldc:int(-3060))))) {
            goto(Label_0212)
        }
        
        var_7_F6 = invokeinterface:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::iterator, var_5_65:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)
        Label_0264:
        
        while (cmpne:boolean(and:int(var_3_EE:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(536870912)), ldc:int(0))) {
                var_3_EE = and:int(var_3_EE:int, ldc:int(-964889154))
                goto(Label_0301)
            }
            
            var_3_EE = and:int(var_3_EE:int, ldc:int(-1774644627))
            
            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_F6:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>))) {
                goto(Label_0301)
            }
            
            var_8_159 = checkcast:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9.class, invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::next, var_7_F6:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>))
            
            if (invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toLowerCase, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, var_8_159:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)), invokevirtual:String(String::toLowerCase, loadelement:String(p1:String[], and:int(ldc:int(9300), ldc:int(-9301))), getstatic:Locale(Locale::ROOT)))) {
                invokeinterface:boolean(List<String>::add, var_6_6E:ArrayList<String>[expected:List<String>], invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, var_8_159:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))
            }
            
            var_3_EE = and:int(var_3_EE:int, ldc:int(-25446435))
        }
        
        goto(Label_0418)
        Label_0124:
        
        if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(524288)), ldc:int(0))) {
            var_3_EE = and:int(var_3_EE:int, ldc:int(-1566351884))
            goto(Label_0212)
        }
        
        if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_EE = and:int(var_3_EE:int, ldc:int(-1036593297))
            
            if (cmpge:boolean(arraylength:int(p1:String[]), and:int(ldc:int(17746), ldc:int(4098)))) {
                if (cmpne:boolean(invokevirtual:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u6198\u946b\ub18d\u4f52\ua562\u99f7, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, loadelement:String(p1:String[], and:int(ldc:int(-20743), ldc:int(20742)))), aconstnull:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9())) {
                    var_7_210 = invokevirtual:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u6198\u946b\ub18d\u4f52\ua562\u99f7, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, loadelement:String(p1:String[], and:int(ldc:int(-16439), ldc:int(16438))))
                    
                    if (invokeinterface:boolean(Set<E>::contains, var_5_65:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>, var_7_210:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9[expected:Object])) {
                        var_9_23D = invokevirtual:List<String>(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\ucfaf\ubf56\uf995\u156b\ud36e\u836c, var_7_210:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, checkcast:String[](java.lang.String[].class, invokestatic:String[](Arrays::copyOfRange, p1:String[], and:int(ldc:int(4245), ldc:int(9985)), arraylength:int(p1:String[]))))
                        invokestatic:void(Collections::sort, var_9_23D:List<String>)
                        return:List<String>(var_9_23D:List<String>)
                    }
                    
                    return:List<String>(var_6_6E:ArrayList<String>[expected:List<String>])
                }
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(2)), ldc:int(0))) {
                var_3_EE = and:int(var_3_EE:int, ldc:int(-850853763))
                goto(Label_0124)
            }
            
            return:List<String>(var_6_6E:ArrayList<String>[expected:List<String>])
        }
        
        Label_0212:
        
        if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_EE = and:int(var_3_EE:int, ldc:int(-1478803941))
            goto(Label_0124)
        }
        
        var_3_EE = and:int(var_3_EE:int, ldc:int(-1032069541))
        var_7_F6 = invokeinterface:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::iterator, var_5_65:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_F6:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)) {
            invokeinterface:boolean(List<String>::add, var_6_6E:ArrayList<String>[expected:List<String>], invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u983f\u960f\u839e\u9033\uc3e3\u5654, checkcast:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9.class, invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::next, var_7_F6:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>))))
        }
        
        goto(Label_0418)
        Label_0301:
        
        if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(64)), ldc:int(0))) {
                var_3_EE = and:int(var_3_EE:int, ldc:int(-718007629))
                goto(Label_0264)
            }
            
            var_3_EE = and:int(var_3_EE:int, ldc:int(-516017301))
            goto(Label_0163)
        }
        
        Label_0418:
        
        if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_EE = and:int(var_3_EE:int, ldc:int(-360148821))
            goto(Label_0301)
        }
        
        if (cmpne:boolean(and:int(var_3_EE:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_EE = and:int(var_3_EE:int, ldc:int(-1467279463))
            goto(Label_0264)
        }
        
        var_3_EE = and:int(var_3_EE:int, ldc:int(-835289089))
        goto(Label_0163)
    }
    
    public void \ud12e\ud523\uc31c\u93a2\u40a9\u67e9(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0) {
        var_4_67 : Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_5_B0 : Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_6_F3 : \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9
        stack_11F_0 : String [generated]
        expr_100 : Object[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_67 = invokespecial:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\ucfaf\uae5d\u5bc4\uc3e3\u3d64\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25)
        
        if (logicalnot:boolean(invokeinterface:boolean(Set::isEmpty, var_4_67:Set))) {
            invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("&aViaVersion &c")), invokeinterface:String(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u3e75\u873d\u3776\u4d85\u12cb\ubff1, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4))))))
            invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, ldc:String("&6Commands:")))
            var_5_B0 = invokeinterface:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::iterator, var_4_67:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_5_B0:Iterator)) {
                var_6_F3 = checkcast:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9.class, invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::next, var_5_B0:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>))
                stack_11F_0 = ldc:String("&2/viaversion %s &7- &6%s")
                expr_100 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(291), ldc:int(1102)))
                storeelement:Object(expr_100:Object[], and:int(ldc:int(16619), ldc:int(-18684)), invokevirtual:String[expected:Object](\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u1833\uc246\u4d85\ubefe\u647c\u16f6, var_6_F3:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))
                storeelement:Object(expr_100:Object[], and:int(ldc:int(801), ldc:int(8275)), invokevirtual:String[expected:Object](\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\uc2e8\u92ee\u56bd\u9937\u9a18\u4bc8, var_6_F3:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))
                invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, invokestatic:String(String::format, stack_11F_0:String, expr_100:Object[])))
            }
            
            invokeinterface:void(Set<E>::clear, var_4_67:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)
            return:void()
        }
        
        invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, ldc:String("&cYou are not allowed to use these commands!")))
    }
    
    private java.util.Set<\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9> \ucfaf\uae5d\u5bc4\uc3e3\u3d64\u0800(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0) {
        var_2_61 : int
        var_4_69 : HashSet<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_5_79 : Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>
        var_2_87 : int
        var_6_C3 : \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(1763891201), ldc:int(-1617429941))
            var_4_69 = initobject:HashSet<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(HashSet<E>::<init>)
            var_5_79 = invokeinterface:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(Collection<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::iterator, invokeinterface:Collection<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::values, getfield:Map<String, \u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u5140\u12b2\u8413\ud36e\u6b0d\u0800, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_87 = and:int(var_2_61:int, ldc:int(2067132792))
                }
                else {
                    var_2_87 = and:int(var_2_61:int, ldc:int(-345843607))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_79:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>)) {
                        var_6_C3 = checkcast:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9.class, invokeinterface:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9(Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::next, var_5_79:Iterator<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>))
                        
                        if (invokespecial:boolean(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc84e\u4d85\ub6ab\uc3e3\u7330\u7049, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokevirtual:String(\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9::\u6ec6\u8bb0\u6c52\u4f4a\u8350\u59ec, var_6_C3:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9))) {
                            invokeinterface:boolean(Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>::add, var_4_69:HashSet<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>[expected:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>], var_6_C3:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9)
                        }
                        
                        var_2_61 = and:int(var_2_87:int, ldc:int(1039391619))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_87:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_87:int, ldc:int(-766364117))
            }
            
            return:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>(var_4_69:HashSet<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>[expected:Set<\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9>])
        }
        
        goto(Label_0006)
    }
    
    private boolean \uc84e\u4d85\ub6ab\uc3e3\u7330\u7049(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0, java.lang.String p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p1:String, aconstnull:String()), logicalnot:boolean(invokeinterface:boolean(\u6d69\ua562\ud158\u62da\ud523\u3c25::\u4c2b\u7af6\u5d20\ufe34\uc3e3\u71ae, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, p1:String))), and:int(ldc:int(-21305), ldc:int(21296)), xor:int(ldc:int(24576), ldc:int(24577))))
        }
        
        goto(Label_0006)
    }
    
    private void \u4bc8\u6d99\u4c04\u74b1\uc7fe\u156b() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u16f6\ua068\u12b2\ubb2b\uf995\u74b1[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u16f6\ua068\u12b2\ubb2b\uf995\u74b1::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u183a\u4c2b\ub6ab\u99f7\u600f\u759a[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u183a\u4c2b\ub6ab\u99f7\u600f\u759a::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u5245\ub32d\u6cfe\uff55\ub102\u4c2b[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u5245\ub32d\u6cfe\uff55\ub102\u4c2b::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u69d9\u760c\u4f4a\ub113\u0a06\uc229[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u69d9\u760c\u4f4a\ub113\u0a06\uc229::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u927d\u6ec6\u3776\ubefe\ub7dc\u74b1[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u927d\u6ec6\u3776\ubefe\ub7dc\u74b1::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\ub171\u4c2b\u6ec6\u76bc\u718f\ub18d[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\ub171\u4c2b\u6ec6\u76bc\u718f\ub18d::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u6198\u72f1\u4d85\u760c\u99f7\uc246[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u6198\u72f1\u4d85\u760c\u99f7\uc246::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\ufe34\uafe7\u7ce1\u4bc8\ucfaf\u416d[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\ufe34\uafe7\u7ce1\u4bc8\ucfaf\u416d::<init>))
            invokevirtual:void(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\uc3e3\u6b0d\u5f50\u8389\u8308\u5140, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504, initobject:\u5140\uc87f\ubb2b\u839e\ub83f\u7049[expected:\u5245\u8aa5\u7d52\u47c2\u6c52\u67e9](\u5140\uc87f\ubb2b\u839e\ub83f\u7049::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u494c\u8389\ub18d\u4bc8\u5d20\u92ee(java.lang.String p0) {
        var_1_8B : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_8B = and:int(ldc:int(369479392), ldc:int(1186360569))
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_1_8B:int, ldc:int(2)), ldc:int(0))) {
                        var_1_8B = and:int(var_1_8B:int, ldc:int(-1866163749))
                    }
                    else {
                        var_1_8B = and:int(var_1_8B:int, ldc:int(1323816950))
                        p0 = invokestatic:String(\u8413\u5140\u51fa\u12cb\u4492\u4cd9::\u120d\u59ec\u7e3f\ubefe\uceb8\u6cfe, ldc:char(38), p0:String)
                    }
                } while (cmpne:boolean(and:int(var_1_8B:int, ldc:int(8)), ldc:int(0)))
                
                var_1_8B = and:int(var_1_8B:int, ldc:int(1716887532))
            }
            catch (java.lang.Exception stack_93_0) {
            }
            
            return:String(p0:String)
        }
        
        goto(Label_0006)
    }
    
    public static void \u960f\u3bd6\uc2bd\uc246\u3776\u47c2(\u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ua562\ud158\u62da\ud523\u3c25 p0, java.lang.String p1, java.lang.Object[] p2) {
        var_3_61 : int
        stack_80_0 : String [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(1758941574), ldc:int(-1085820426))
            
            if (cmpne:boolean(p2:Object[], aconstnull:Object[]())) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-61408441))
                stack_80_0 = invokestatic:String(String::format, p1:String, p2:Object[])
            }
            else {
                stack_80_0 = p1:String
            }
            
            invokeinterface:void(\u6d69\ua562\ud158\u62da\ud523\u3c25::\uff55\u946b\u93a2\u983f\u120d\u51b2, p0:\u6d69\ua562\ud158\u62da\ud523\u3c25, invokestatic:String(\u9033\u98a4\u5654\u4f4a\ua61f\u3504::\u494c\u8389\ub18d\u4bc8\u5d20\u92ee, stack_80_0:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\uc910\u7049\uc2e8\uc87f\u4bc8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AF : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BA : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6AF = and:int(ldc:int(-1700773787), ldc:int(-121974678))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\u98a4\u5654\u4f4a\ua61f\u3504[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-201880439))
        }
        else {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-626537221))
            var_5_8A = and:int(ldc:int(4751), ldc:int(-24208))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21682), ldc:int(-21683)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6AF:int, ldc:int(-151458069))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(577), ldc:int(11)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(20581), ldc:int(515)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_DA:int, ldc:int(-1716721687))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(2133), ldc:int(641)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-333391758))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1902264234))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1903385465))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1121955660))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0842)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-810728968))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-23837290))
                        goto(Label_0603)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1380887205))
                    }
                    else {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1864089116))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0603)
                            }
                            
                            goto(Label_0842)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-471870232))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1386393755))
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-30697538))
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1231737617))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1504965458))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-223191054))
                        var_11_EB = and:int(ldc:int(437), ldc:int(-1470))
                        goto(Label_1564)
                    }
                    
                    Label_0603:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-242544394))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2044456455))
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1575319239))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1421403947))
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1879071185))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1750402058))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0842)
                        }
                    }
                    
                    Label_0733:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1932507103))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1818543138))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0603)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-253363464))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0842:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1697083034))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1382826848))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1334819774))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-517684691))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1958266130))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(58949970))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1051691103))
                            goto(Label_0603)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-185244057))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(2881), ldc:int(4229))
                                goto(Label_1143)
                            }
                        }
                    }
                    
                    Label_0988:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1789600558))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1262008767))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0842)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1414393138))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0603)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1742708306))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-591899657))
                        var_11_EB = and:int(ldc:int(-25116), ldc:int(25112))
                    }
                    
                    Label_1143:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1339097052))
                            goto(Label_0988)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1340493071))
                            goto(Label_0842)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(414183608))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0603)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1124077383))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1916814869))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1633526410))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1414)
                            }
                        }
                    }
                    
                    Label_1274:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1084177982))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1143)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1105055815))
                            goto(Label_0988)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1511657964))
                            goto(Label_0842)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-482562131))
                            goto(Label_0603)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1393107506))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-575672601))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1564)
                    }
                    
                    Label_1414:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2067772741))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1987472788))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1982947468))
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0842)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(58750730))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(168996032))
                        goto(Label_0603)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-100903844))
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1863358978))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1299792341))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1490728026))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1948698483))
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(132160208))
                        goto(Label_0733)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2049336169))
                        goto(Label_0603)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-594309475))
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1091997468))
                        var_17_6BA = add:int(var_16_119:int, and:int(ldc:int(2177), ldc:int(25)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(321507243))
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(-235023774))
                
                if (cmple:boolean(var_5_8A = var_17_6BA:int, sub:int(var_6_91:int, xor:int(ldc:int(20640), ldc:int(20641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
