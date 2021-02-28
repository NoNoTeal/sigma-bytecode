public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u6cfe\u4f4a\u718f\u6b0d\u9af2 {
    public void \u6cfe\u4f4a\u718f\u6b0d\u9af2() {
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
            invokespecial:Object(Object::<init>, this:\u6cfe\u4f4a\u718f\u6b0d\u9af2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5db4\u873d\u6198\u8cae\u7006\u6435(java.lang.String p0, java.lang.String p1) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(747050303), ldc:int(-1223837377))
            
            if (cmpne:boolean(p1:String, aconstnull:String())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(930986991))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, invokestatic:int(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u071d\uafe7\u72f1\u494c\u4c2b\u3dd3, p0:String, p1:String))
            }
            else {
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8308\u3e2a\u3dd3\ufe34\u3bd6\u69d9(java.lang.String p0, java.lang.Runnable p1) {
        var_2_15C : int
        
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
            var_2_15C = and:int(ldc:int(-1984370105), ldc:int(-638013858))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0300)
                }
                
                if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0264)
                }
                
                if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_15C = and:int(var_2_15C:int, ldc:int(-1236378764))
                    goto(Label_0209)
                }
                
                if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(4)), ldc:int(0))) {
                    var_2_15C = and:int(var_2_15C:int, ldc:int(-484324365))
                    goto(Label_0148)
                }
                
                var_2_15C = and:int(var_2_15C:int, ldc:int(-1950377145))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b0d\ud7e8\u965f\uc87f\uc238\u8d98)
                
                try {
                    loop {
                        Label_0148:
                        
                        if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(4)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(-30893473))
                            goto(Label_0300)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(1746913220))
                            goto(Label_0264)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(128)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(2024364913))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_15C = and:int(var_2_15C:int, ldc:int(-1678197817))
                            invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5bc4\u183a\ufcaf\u5654\ub70c\ud171, p0:String)
                        }
                        
                        Label_0209:
                        
                        if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0300)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(1571292929))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(8)), ldc:int(0))) {
                                var_2_15C = and:int(var_2_15C:int, ldc:int(1678736423))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(262144)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_15C = and:int(var_2_15C:int, ldc:int(498940751))
                            invokeinterface:void(Runnable::run, p1:Runnable)
                        }
                        
                        Label_0264:
                        
                        if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(16)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0209)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(64)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(1073741824)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_15C = and:int(var_2_15C:int, ldc:int(-575115577))
                            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u392e\u0b8e\u5654\uceb8\u839e\u16f6)
                        }
                        
                        Label_0300:
                        
                        if (cmpne:boolean(and:int(var_2_15C:int, ldc:int(131072)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(-1036501810))
                            goto(Label_0264)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(2)), ldc:int(0))) {
                            var_2_15C = and:int(var_2_15C:int, ldc:int(1902541215))
                            goto(Label_0209)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(16)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_15C:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_15C = and:int(var_2_15C:int, ldc:int(-1073833233))
                }
                finally {
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u392e\u0b8e\u5654\uceb8\u839e\u16f6)
                    var_2_15C = and:int(var_2_15C:int, ldc:int(-34017434))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u7043\u71f1\u61a4\u3c25\u494c\uae87(java.util.UUID p0) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c::\u4e72\ub18d\uc84e\u99f7\ucfaf\u97e6, p0:UUID))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u5bc4\u183a\ufcaf\u5654\ub70c\ud171(java.lang.String p0) {
        var_1_C8 : int
        var_3_64 : UUID
        var_4_F4 : \u120d\ud7e8\u12b2\u97b7\uc3e3
        
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
            var_1_C8 = and:int(ldc:int(1264970475), ldc:int(2140977987))
            var_3_64 = invokestatic:UUID(UUIDTypeAdapter::fromString, p0:String)
            
            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711), p0:String[expected:Object]))) {
                loop {
                    if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(2)), ldc:int(0))) {
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(-1412357986))
                    }
                    else {
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(-824907241))
                        
                        if (invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<String, Boolean>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\ucfaf\u8308\u527a\u3776\u4179), p0:String[expected:Object])) {
                            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokeinterface:Boolean(Map<String, Boolean>::get, getstatic:Map<String, Boolean>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\ucfaf\u8308\u527a\u3776\u4179), p0:String[expected:Object])))) {
                                goto(Label_0313)
                            }
                            
                            invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u7043\u71f1\u61a4\u3c25\u494c\uae87, var_3_64:UUID)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0159:
                    
                    if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0351)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(4)), ldc:int(0))) {
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(1607200734))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(512)), ldc:int(0))) {
                            var_1_C8 = and:int(var_1_C8:int, ldc:int(-314722743))
                            loopcontinue()
                        }
                        
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(2115610291))
                        invokeinterface:Boolean(Map<String, Boolean>::put, getstatic:Map<String, Boolean>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\ucfaf\u8308\u527a\u3776\u4179), p0:String, invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(18283), ldc:int(-20348))))
                        invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u7043\u71f1\u61a4\u3c25\u494c\uae87, var_3_64:UUID)
                        var_4_F4 = initobject:\u120d\ud7e8\u12b2\u97b7\uc3e3(\u120d\ud7e8\u12b2\u97b7\uc3e3::<init>, loadelement:String(getstatic:String[](\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4c04\u7af6\u36d3\uc246\uc3e3\ub83f), and:int(ldc:int(18064), ldc:int(-18065))), p0:String)
                        invokevirtual:void(Thread::setDaemon, var_4_F4:\u120d\ud7e8\u12b2\u97b7\uc3e3[expected:Thread], and:int[expected:boolean](ldc:int(1027), ldc:int(2413)))
                        invokevirtual:void(Thread::start, var_4_F4:\u120d\ud7e8\u12b2\u97b7\uc3e3[expected:Thread])
                        looporswitchbreak()
                    }
                    
                    Label_0313:
                    
                    if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0159)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(-14238021))
                        
                        if (invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<String, String>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4daf\u0a06\u7c6b\uc2bd\u9af2\u8d90), p0:String[expected:Object])) {
                            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, invokestatic:int(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u071d\uafe7\u72f1\u494c\u4c2b\u3dd3, p0:String, checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::get, getstatic:Map<String, String>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4daf\u0a06\u7c6b\uc2bd\u9af2\u8d90), p0:String[expected:Object]))))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0351:
                    
                    if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(-740345074))
                        goto(Label_0159)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C8:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_C8 = and:int(var_1_C8:int, ldc:int(-883545549))
                        invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u7043\u71f1\u61a4\u3c25\u494c\uae87, var_3_64:UUID)
                        looporswitchbreak()
                    }
                }
            }
            else {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, invokestatic:int(\ua3b4\ub171\uc2e8\u3776\uc238::\u5654\u4492\u759a\u9033\u4492\u12cb, checkcast:\ua3b4\ub171\uc2e8\u3776\uc238(\ub113\uc4d2\u183a\u527a\u6435.\ua3b4\ub171\uc2e8\u3776\uc238.class, invokeinterface:\ua3b4\ub171\uc2e8\u3776\uc238(Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>::get, getstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711), p0:String[expected:Object]))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int \u071d\uafe7\u72f1\u494c\u4c2b\u3dd3(java.lang.String p0, java.lang.String p1) {
        var_2_198 : int
        var_5_191 : int
        var_2_C4 : int
        var_4_D1 : \ua3b4\ub171\uc2e8\u3776\uc238
        var_2_18B : int
        var_2_1AA : int
        var_4_1AC : IntBuffer
        var_6_1B5 : int
        var_7_1BE : int
        var_8_1D2 : ByteArrayInputStream
        var_9_1D9 : BufferedImage
        var_10_20A : int[]
        var_2_256 : int
        var_8_291 : IOException
        
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
            var_2_198 = and:int(ldc:int(-1393273027), ldc:int(-295833730))
            
            loop {
                if (cmpne:boolean(and:int(var_2_198:int, ldc:int(128)), ldc:int(0))) {
                    var_2_198 = and:int(var_2_198:int, ldc:int(635062609))
                    goto(Label_0162)
                }
                
                if (cmpne:boolean(and:int(var_2_198:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_198 = and:int(var_2_198:int, ldc:int(-1879849087))
                }
                else {
                    var_2_198 = and:int(var_2_198:int, ldc:int(-10109633))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711), p0:String[expected:Object]))) {
                        var_5_191 = invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u34df\uc7fe\ud12e\u99f7\ubff1\ua61f)
                        looporswitchbreak()
                    }
                }
                
                Label_0143:
                
                if (cmpeq:boolean(and:int(var_2_198:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_198:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_198 = and:int(var_2_198:int, ldc:int(-1092771408))
                }
                
                Label_0162:
                
                if (cmpeq:boolean(and:int(var_2_198:int, ldc:int(256)), ldc:int(0))) {
                    var_2_198 = and:int(var_2_198:int, ldc:int(-1603674143))
                    goto(Label_0143)
                }
                
                if (cmpne:boolean(and:int(var_2_198:int, ldc:int(64)), ldc:int(0))) {
                    var_2_198 = and:int(var_2_198:int, ldc:int(-1085182834))
                }
                else {
                    var_2_C4 = and:int(var_2_198:int, ldc:int(-1377312836))
                    var_4_D1 = checkcast:\ua3b4\ub171\uc2e8\u3776\uc238(\ub113\uc4d2\u183a\u527a\u6435.\ua3b4\ub171\uc2e8\u3776\uc238.class, invokeinterface:\ua3b4\ub171\uc2e8\u3776\uc238(Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>::get, getstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711), p0:String[expected:Object]))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0359)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(1283300246))
                            goto(Label_0299)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(1726682069))
                        }
                        else {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(-272227974))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokestatic:String(\ua3b4\ub171\uc2e8\u3776\uc238::\u836c\u759a\u2dcc\u36d3\u8d90\ub113, var_4_D1:\ua3b4\ub171\uc2e8\u3776\uc238), p1:String[expected:Object]))) {
                                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ub102\u0c95\u8d98\u6435\ud158\u960f, invokestatic:int(\ua3b4\ub171\uc2e8\u3776\uc238::\u5654\u4492\u759a\u9033\u4492\u12cb, var_4_D1:\ua3b4\ub171\uc2e8\u3776\uc238))
                                goto(Label_0359)
                            }
                        }
                        
                        Label_0265:
                        
                        if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(553962107))
                            goto(Label_0359)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(32)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(4194304)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(-1116991175))
                        }
                        
                        Label_0299:
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(128)), ldc:int(0))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(-1091658960))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(2147483647)), ldc:int(0))) {
                                goto(Label_0265)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(262144)), ldc:int(0))) {
                                var_2_C4 = and:int(var_2_C4:int, ldc:int(1331652198))
                                loopcontinue()
                            }
                            
                            return:int(invokestatic:int(\ua3b4\ub171\uc2e8\u3776\uc238::\u5654\u4492\u759a\u9033\u4492\u12cb, var_4_D1:\ua3b4\ub171\uc2e8\u3776\uc238))
                        }
                        
                        Label_0359:
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0299)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(946647631))
                            goto(Label_0265)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_C4:int, ldc:int(64)), ldc:int(0))) {
                            var_2_18B = and:int(var_2_C4:int, ldc:int(-1127321163))
                            var_5_191 = invokestatic:int(\ua3b4\ub171\uc2e8\u3776\uc238::\u5654\u4492\u759a\u9033\u4492\u12cb, var_4_D1:\ua3b4\ub171\uc2e8\u3776\uc238)
                            var_2_198 = and:int(var_2_18B:int, ldc:int(-286863498))
                            looporswitchbreak(Label_0421)
                        }
                    }
                }
            }
            
            Label_0421:
            var_2_1AA = and:int(var_2_198:int, ldc:int(-10667213))
            var_4_1AC = aconstnull:IntBuffer()
            var_6_1B5 = and:int(ldc:int(-32324), ldc:int(15937))
            var_7_1BE = and:int(ldc:int(-5768), ldc:int(5765))
            
            try {
                var_8_1D2 = initobject:ByteArrayInputStream(ByteArrayInputStream::<init>, invokevirtual:byte[](Base64::decode, initobject:Base64(Base64::<init>), p1:String))
                
                try {
                    var_9_1D9 = invokestatic:BufferedImage(ImageIO::read, var_8_1D2:ByteArrayInputStream[expected:InputStream])
                }
                finally {
                    invokestatic:void(IOUtils::closeQuietly, var_8_1D2:ByteArrayInputStream)
                }
                
                var_6_1B5 = invokevirtual:int(BufferedImage::getWidth, var_9_1D9:BufferedImage)
                var_7_1BE = invokevirtual:int(BufferedImage::getHeight, var_9_1D9:BufferedImage)
                var_10_20A = newarray:int[](int.class, mul:int(var_6_1B5:int, var_7_1BE:int))
                invokevirtual:int[](BufferedImage::getRGB, var_9_1D9:BufferedImage, and:int(ldc:int(9277), ldc:int(-9790)), and:int(ldc:int(31247), ldc:int(-32272)), var_6_1B5:int, var_7_1BE:int, var_10_20A:int[], and:int(ldc:int(-24460), ldc:int(8073)), var_6_1B5:int)
                var_4_1AC = invokevirtual:IntBuffer(ByteBuffer::asIntBuffer, invokevirtual:ByteBuffer(ByteBuffer::order, invokestatic:ByteBuffer(ByteBuffer::allocateDirect, mul:int(mul:int(xor:int(ldc:int(3), ldc:int(7)), var_6_1B5:int), var_7_1BE:int)), invokestatic:ByteOrder(ByteOrder::nativeOrder)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_1AA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_256 = and:int(var_2_1AA:int, ldc:int(-2012153386))
                    }
                    else {
                        var_2_256 = and:int(var_2_1AA:int, ldc:int(-278027468))
                        invokevirtual:IntBuffer(IntBuffer::put, var_4_1AC:IntBuffer, var_10_20A:int[])
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_256:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_1AA = and:int(var_2_256:int, ldc:int(-1735671556))
                }
                
                invokevirtual:Buffer(Buffer::flip, var_4_1AC:IntBuffer[expected:Buffer])
            }
            catch (java.io.IOException var_8_291) {
                invokevirtual:void(Throwable::printStackTrace, var_8_291:IOException[expected:Throwable])
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u839e\ua562\u5f50\u4f4a\u3e2a\u983f, ldc:int(33984))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6cfe\u67e9\u6b0d\u3e75\u8709\u98a4, var_5_191:int)
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ud171\u92ee\ubff1\ud171\u7e3f\u8389, var_4_1AC:IntBuffer, var_6_1B5:int, var_7_1BE:int)
            invokeinterface:\ua3b4\ub171\uc2e8\u3776\uc238(Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>::put, getstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711), p0:String, initobject:\ua3b4\ub171\uc2e8\u3776\uc238(\ua3b4\ub171\uc2e8\u3776\uc238::<init>, p1:String, var_5_191:int))
            return:int(var_5_191:int)
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u3d4b\ua068\u1833\u8aa5\uc910\u7bad() {
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
            return:Logger(getstatic:Logger(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u759a\ud523\u61a4\u8640\u97b7\uc84e))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u47c2\u6d69\ua068\u4e72\uf9c5\ub6ab() {
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
            return:Map(getstatic:Map<String, Boolean>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\ucfaf\u8308\u527a\u3776\u4179))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \ube23\u960f\uc84e\ub6ab\ub102\uc87f() {
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
            return:Map(getstatic:Map<String, String>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4daf\u0a06\u7c6b\uc2bd\u9af2\u8d90))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_236 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_141_0 : byte[] [generated]
        stack_249_0 : byte[] [generated]
        stack_28E_0 : byte[] [generated]
        stack_314_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1D1 : byte[]
        var_4_1D2 : int
        expr_B0 : int [generated]
        var_5_222 : int
        var_3_227 : byte[]
        var_4_228 : int
        var_0_2A8 : int
        expr_28E : byte [generated]
        stack_2DF_2 : byte [generated]
        stack_2B4_0 : byte [generated]
        expr_E6 : int [generated]
        expr_114 : int [generated]
        var_3_302 : byte[]
        var_4_303 : int
        expr_314 : byte [generated]
        var_3_14D : String
        expr_155 : String[] [generated]
        expr_15F : String[] [generated]
        var_3_19D : String[]
        
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
            var_0_236 = and:int(ldc:int(277208076), ldc:int(-1343906677))
            expr_68 = var_2_6C = stack_AE_0 = stack_B0_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_114_0 = stack_141_0 = stack_249_0 = stack_28E_0 = stack_314_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("GGieiHAUzQ5YfJqWujjZEDiMtIyMjpp4cK6YfJqWtIIOqvKCKHDstJaUmmAqrvCSqGQclwiilIA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1D1 = newarray:byte[](byte.class, expr_70:int)
                var_4_1D2 = expr_70:int
                
                loop {
                    var_0_236 = and:int(var_0_236:int, ldc:int(-1464492916))
                    var_4_1D2 = add:int(var_4_1D2:int, ldc:int(-1))
                    storeelement:byte(var_3_1D1:byte[], var_4_1D2:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1D2:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1D2:int, xor:int(ldc:int(275), ldc:int(274)))), ldc:int(5)), xor:int(ldc:int(17153), ldc:int(17158)))))
                    
                    if (cmpne:boolean(var_4_1D2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_114_0 = stack_141_0 = stack_249_0 = stack_28E_0 = stack_314_0 = var_3_1D1:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(-1281897763))
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(2)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(1097366686))
                    goto(Label_0235)
                }
                
                if (cmpeq:boolean(and:int(var_0_236:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(-1804788140))
                    goto(Label_0181)
                }
                
                var_0_236 = and:int(var_0_236:int, ldc:int(14522611))
                expr_B0 = arraylength:int(stack_B0_0:byte[])
                
                if (cmpeq:boolean(expr_B0:int, ldc:int(0))) {
                    goto(Label_0181)
                }
                
                var_5_222 = expr_B0:int
                var_3_227 = newarray:byte[](byte.class, expr_B0:int)
                var_4_228 = expr_B0:int
                Label_0554:
                
                while (cmpne:boolean(and:int(var_0_236:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(-1612203646))
                    var_4_228 = add:int(var_4_228:int, ldc:int(-1))
                    storeelement:byte(var_3_227:byte[], var_4_228:int, add:byte(loadelement:byte(stack_249_0:byte[], var_4_228:int), ldc:byte(76)))
                    
                    if (cmpne:boolean(var_4_228:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_B0_0 = stack_AE_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_114_0 = stack_141_0 = stack_249_0 = stack_28E_0 = stack_314_0 = var_3_227:byte[]
                    goto(Label_0181)
                }
                
                var_0_236 = and:int(var_0_236:int, ldc:int(1256907637))
                Label_0632:
                
                while (cmpeq:boolean(and:int(var_0_236:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_2A8 = and:int(var_0_236:int, ldc:int(-1998717534))
                    var_4_228 = add:int(var_4_228:int, ldc:int(-1))
                    expr_28E = stack_2DF_2 = loadelement(stack_28E_0, var_4_228)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_228:int, ldc:int(2)), neg:int(var_5_222:int)), ldc:int(0))) {
                        stack_2DF_2 = stack_2B4_0 = add:byte(expr_28E:byte, loadelement:byte(var_3_227:byte[], add:int(var_4_228:int, ldc:int(2))))
                        goto(Label_0708)
                    }
                    
                    Label_0667:
                    
                    if (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(2068006968))
                    }
                    else {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(277348175))
                        stack_2DF_2 = stack_2B4_0 = add:byte(expr_28E:byte, ldc:byte(2))
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-1819868944))
                        goto(Label_0667)
                    }
                    
                    var_0_236 = and:int(var_0_2A8:int, ldc:int(-2080923930))
                    storeelement:byte(var_3_227:byte[], var_4_228:int, stack_2DF_2:byte)
                    
                    if (cmpne:boolean(var_4_228:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_B0_0 = stack_AE_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_114_0 = stack_141_0 = stack_249_0 = stack_28E_0 = stack_314_0 = var_3_227:byte[]
                    goto(Label_0235)
                }
                
                goto(Label_0554)
                Label_0181:
                
                if (cmpeq:boolean(and:int(var_0_236:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(-883785821))
                    goto(Label_0281)
                }
                
                if (cmpeq:boolean(and:int(var_0_236:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_236:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_236 = and:int(var_0_236:int, ldc:int(-407936642))
                        loopcontinue()
                    }
                    
                    var_0_236 = and:int(var_0_236:int, ldc:int(-726795556))
                    expr_E6 = arraylength:int(stack_E6_0:byte[])
                    
                    if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                        var_5_222 = expr_E6:int
                        var_3_227 = newarray:byte[](byte.class, expr_E6:int)
                        var_4_228 = expr_E6:int
                        goto(Label_0632)
                    }
                }
                
                Label_0235:
                
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_236:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_236:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_236 = and:int(var_0_236:int, ldc:int(-407285178))
                        loopcontinue()
                    }
                    
                    var_0_236 = and:int(var_0_236:int, ldc:int(948944060))
                    expr_114 = arraylength:int(stack_114_0:byte[])
                    
                    if (cmpne:boolean(expr_114:int, ldc:int(0))) {
                        var_3_302 = newarray:byte[](byte.class, expr_114:int)
                        var_4_303 = expr_114:int
                        
                        loop {
                            var_0_236 = and:int(var_0_236:int, ldc:int(-1735943125))
                            var_4_303 = add:int(var_4_303:int, ldc:int(-1))
                            expr_314 = loadelement:byte(stack_314_0:byte[], var_4_303:int)
                            storeelement:byte(var_3_302:byte[], var_4_303:int, xor:int(or:int(and:int(shl:int(expr_314:byte, and:int(ldc:int(16909), ldc:int(10500))), ldc:int(-16)), and:int(shr:int(expr_314:byte[expected:int], xor:int(ldc:int(16900), ldc:int(16896))), ldc:int(15))), ldc:int(72)))
                            
                            if (cmpne:boolean(var_4_303:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_B0_0 = stack_AE_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_114_0 = stack_141_0 = stack_249_0 = stack_28E_0 = stack_314_0 = var_3_302:byte[]
                    }
                }
                
                Label_0281:
                
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_236 = and:int(var_0_236:int, ldc:int(21556254))
                    goto(Label_0181)
                }
                
                if (cmpne:boolean(and:int(var_0_236:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_14D = initobject:String(String::<init>, stack_141_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_155 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16427), ldc:int(834)))
            expr_15F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(52), ldc:int(54)))
            storeelement:String(expr_15F:String[], and:int(ldc:int(-27795), ldc:int(25746)), invokevirtual:String[expected:String](String::substring, var_3_14D:String, and:int(ldc:int(-32354), ldc:int(13889)), and:int(ldc:int(4383), ldc:int(10905))))
            storeelement:String(expr_155:String[], xor:int(ldc:int(-16112), ldc:int(-16111)), invokevirtual:String[expected:String](String::substring, var_3_14D:String, and:int(ldc:int(315), ldc:int(7193)), xor:int(ldc:int(619), ldc:int(604))))
            putstatic:String[](\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4c04\u7af6\u36d3\uc246\uc3e3\ub83f, expr_15F:String[])
            var_3_19D = expr_155:String[]
            putstatic:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711, invokestatic:HashMap[expected:Map<String, \ua3b4\ub171\uc2e8\u3776\uc238>](Maps::newHashMap))
            putstatic:Map<String, Boolean>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\ucfaf\u8308\u527a\u3776\u4179, invokestatic:HashMap[expected:Map<String, Boolean>](Maps::newHashMap))
            putstatic:Map<String, String>(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u4daf\u0a06\u7c6b\uc2bd\u9af2\u8d90, invokestatic:HashMap[expected:Map<String, String>](Maps::newHashMap))
            putstatic:Logger(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u759a\ud523\u61a4\u8640\u97b7\uc84e, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_19D:String[], and:int(ldc:int(21313), ldc:int(37)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u8d98\ud12e\u4492\u9af2\ub6ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_664 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_66F : int
        
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
        var_3_664 = and:int(ldc:int(723421172), ldc:int(-1344628803))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6cfe\u4f4a\u718f\u6b0d\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(32)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(656329716))
            var_5_80 = and:int(ldc:int(4706), ldc:int(-6755))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12041), ldc:int(-32654)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_664:int, ldc:int(998165484))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, and:int(ldc:int(17445), ldc:int(851)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(16488), ldc:int(16489)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_664 = and:int(var_3_CF:int, ldc:int(-1144331283))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(26371), ldc:int(65)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(443677719))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1033794707))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1959152039))
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(594521014))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0562)
                            }
                            
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0385:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(2121555843))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(71519696))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-2048608663))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-757342790))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1862758212))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(332395623))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-74778700))
                        var_11_E0 = and:int(ldc:int(3298), ldc:int(-3315))
                        goto(Label_1544)
                    }
                    
                    Label_0562:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1430596148))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1558274120))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1703293233))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-532584567))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-924659903))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(18864127))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(2006643685))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1608557324))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-240345826))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-296009618))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(995966473))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1732953307))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1284581379))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0832:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-768086159))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-518560178))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-207593459))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(772999715))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1064524075))
                            goto(Label_0562)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1912917411))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1669244902))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = and:int(ldc:int(5263), ldc:int(25105))
                                goto(Label_1141)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(789401979))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1210193676))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-726664086))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1005275699))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-584128911))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(240893389))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1739492260))
                        var_11_E0 = and:int(ldc:int(-4940), ldc:int(4938))
                    }
                    
                    Label_1141:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1420329094))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1720259403))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(175444701))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-551616838))
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1058347459))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(1066400742))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1406)
                            }
                        }
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1124476234))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-563747385))
                            goto(Label_1141)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1901770281))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1615313705))
                            goto(Label_0562)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-418155757))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-475335746))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1406:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-460168282))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1733823706))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(256)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-401003895))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1341713127))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-511134570))
                        loopcontinue()
                    }
                    
                    var_3_664 = and:int(var_3_664:int, ldc:int(-1492129803))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1777689239))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1546654740))
                        var_17_66F = add:int(var_16_10E:int, and:int(ldc:int(12033), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_664 = and:int(var_3_664:int, ldc:int(999025660))
                
                if (cmple:boolean(var_5_80 = var_17_66F:int, sub:int(var_6_87:int, xor:int(ldc:int(16640), ldc:int(16641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
