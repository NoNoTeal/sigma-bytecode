public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a {
    public void \u74b1\u59ec\u2dcc\u8413\u8c8a(java.lang.String[] p0) {
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
            invokespecial:Object(Object::<init>, this:\u74b1\u59ec\u2dcc\u8413\u8c8a)
            putfield:Set<String>(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u183a\u6435\u92ff\u47c2\u960f\ua068, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, invokestatic:ImmutableSet[expected:Set<String>](ImmutableSet::copyOf, p0:String[][expected:Object[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \uc246\u9af2\uafe7\u9033\u5d20\ubcb0(java.lang.String p0) {
        var_4_C5 : Path
        
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
        
        if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(String::contains, p0:String, loadelement:String[expected:CharSequence](getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-26821), ldc:int(26820)))), invokevirtual:boolean(String::contains, p0:String, loadelement:String[expected:CharSequence](getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(273), ldc:int(18569))))))) {
            if (cmpne:boolean(getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), aconstnull:Path())) {
                var_4_C5 = invokeinterface:Path(Path::resolve, getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), p0:String)
                
                if (invokestatic:boolean(Files::exists, var_4_C5:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-703), ldc:int(574))))) {
                    return:InputStream(invokestatic:InputStream(Files::newInputStream, var_4_C5:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-25470), ldc:int(24605)))))
                }
            }
            
            return:InputStream(invokevirtual:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, p0:String))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(2148), ldc:int(2150)))))
    }
    
    public java.io.InputStream \uc4d2\ubb2b\ufe34\u960f\u6435\u600f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
        var_5_66 : InputStream
        
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
        var_5_66 = invokevirtual:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, p0:\u983f\u6c56\u6bb9\u927d\u965f, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (cmpeq:boolean(var_5_66:InputStream, aconstnull:InputStream())) {
            athrow(initobject:FileNotFoundException(FileNotFoundException::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        return:InputStream(var_5_66:InputStream)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u7bad\ua3b4\u92ff\ub32d\u6198\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, java.lang.String p1, java.lang.String p2, int p3, java.util.function.Predicate<java.lang.String> p4) {
        var_6_63F : int
        var_8_6D : HashSet
        var_9_318 : Enumeration<URL>
        var_10_370 : URI
        var_9_3DA : URL
        var_10_4E0 : URI
        var_6_5BB : int
        var_11_5EA : URL
        var_6_5F2 : int
        var_12_5FC : Path
        var_6_60C : int
        var_6_6EE : int
        var_11_728 : Path
        var_6_738 : int
        stack_7AB_0 : Throwable [generated]
        
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
            var_6_63F = and:int(and:int(ldc:int(-205937612), ldc:int(-1013236449)), ldc:int(-752980140))
            var_8_6D = invokestatic:HashSet(Sets::newHashSet)
            
            loop {
                Label_0111:
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(131072)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(72959886))
                    goto(Label_0726)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(131072)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1324815978))
                    goto(Label_0631)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-2029665250))
                    goto(Label_0539)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-2055408917))
                    goto(Label_0435)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-608972488))
                    goto(Label_0317)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1083417187))
                    
                    if (cmpeq:boolean(getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), aconstnull:Path())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0222:
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(262144)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-739321794))
                    goto(Label_0726)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1123077614))
                    goto(Label_0631)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0539)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(1861865530))
                    goto(Label_0435)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(119621591))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-214257763))
                }
                
                try {
                    Label_0317:
                    
                    while (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(-224009808))
                            goto(Label_0539)
                        }
                        
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(524288)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                                var_6_63F = and:int(var_6_63F:int, ldc:int(1833178317))
                                goto(Label_0222)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(128)), ldc:int(0))) {
                                var_6_63F = and:int(var_6_63F:int, ldc:int(1224531595))
                                loopcontinue(Label_0111)
                            }
                            
                            var_6_63F = and:int(var_6_63F:int, ldc:int(-1482117316))
                            invokestatic:void(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc87f\u5db4\uff55\u446c\u3776\u7af6, var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], p3:int, p1:String, invokeinterface:Path(Path::resolve, getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), p2:String, p4:Predicate<String>)
                        }
                        
                        Label_0435:
                        
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(-1102160364))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(750817291))
                            goto(Label_0631)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(-472829087))
                            goto(Label_0539)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0222)
                        }
                        
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(1380933943))
                            loopcontinue(Label_0111)
                        }
                        
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1819599460))
                        goto(Label_0539)
                    }
                    
                    var_6_63F = and:int(var_6_63F:int, ldc:int(1414215186))
                    goto(Label_0726)
                }
                catch (java.io.IOException stack_219_0) {
                }
                
                Label_0539:
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0726)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-11463566))
                }
                else {
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1388429175))
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1426055853))
                        goto(Label_0317)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0222)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1551086084))
                    
                    if (cmpne:boolean(p0:\u983f\u6c56\u6bb9\u927d\u965f, getstatic:\u983f\u6c56\u6bb9\u927d\u965f(\u983f\u6c56\u6bb9\u927d\u965f::\u071d\ud12e\u8d98\u8308\u5d20\u7e3f))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0631:
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(381004952))
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1575444929))
                        goto(Label_0317)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-2103043799))
                        goto(Label_0222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1408273985))
                        loopcontinue()
                    }
                    
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1688439659))
                }
                
                Label_0726:
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0631)
                }
                
                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0539)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0435)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1689674449))
                    goto(Label_0317)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0222)
                }
                
                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1278503148))
                    var_9_318 = aconstnull:Enumeration<URL>()
                    
                    try {
                        var_9_318 = invokevirtual:Enumeration<URL>(ClassLoader::getResources, invokevirtual:ClassLoader(Class<T>::getClassLoader, getstatic:Class<?>(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3a62\u4daf\u759a\u36d3\u7873\u4179)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-5163), ldc:int(5162))))))
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1678826122))
                    }
                    catch (java.io.IOException stack_352_0) {
                    }
                    
                    while (logicaland:boolean(cmpne:boolean(var_9_318:Enumeration<URL>, aconstnull:Enumeration<URL>()), invokeinterface:boolean(Enumeration<E>::hasMoreElements, var_9_318:Enumeration<URL>))) {
                        try {
                            var_10_370 = invokevirtual:URI(URL::toURI, checkcast:URL(java.net.URL.class, invokeinterface:URL(Enumeration<URL>::nextElement, var_9_318:Enumeration<URL>)))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(-16382), ldc:int(-16383))), invokevirtual:String(URI::getScheme, var_10_370:URI)))) {
                                loopcontinue()
                            }
                            
                            invokestatic:void(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc87f\u5db4\uff55\u446c\u3776\u7af6, var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], p3:int, p1:String, invokestatic:Path(Paths::get, var_10_370:URI), p2:String, p4:Predicate<String>)
                        }
                        catch (java.net.URISyntaxException | java.io.IOException ex_39F) {
                        }
                    }
                    
                    looporswitchbreak()
                }
            }
            
            try {
                var_9_3DA = invokevirtual:URL(Class<T>::getResource, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(13228), ldc:int(-13245)))), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(2064), ldc:int(2068))))))
                
                loop {
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(2114986239))
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1258774159))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1162642909))
                    }
                    else {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1344639179))
                        
                        if (cmpne:boolean(var_9_3DA:URL, aconstnull:URL())) {
                            var_10_4E0 = invokevirtual:URI(URL::toURI, var_9_3DA:URL)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-969102346))
                                    goto(Label_1703)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(67108864)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-485278871))
                                    goto(Label_1630)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(262144)), ldc:int(0))) {
                                    goto(Label_1396)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(131072)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1616182027))
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(2067), ldc:int(35))), invokevirtual:String(URI::getScheme, var_10_4E0:URI)))) {
                                        if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(16652), ldc:int(16651))), invokevirtual:String(URI::getScheme, var_10_4E0:URI))) {
                                            goto(Label_1630)
                                        }
                                        
                                        invokeinterface:void(Logger::error, getstatic:Logger(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(140), ldc:int(133))), var_10_4E0:URI[expected:Object])
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_1334:
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(524288)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(1162925572))
                                    goto(Label_1703)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1630)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(871885713))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-474069729))
                                }
                                
                                Label_1396:
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(128)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-607456082))
                                    goto(Label_1703)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(262144)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1540523377))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(262144)), ldc:int(0))) {
                                        goto(Label_1334)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_6_63F = and:int(var_6_63F:int, ldc:int(859723099))
                                        loopcontinue()
                                    }
                                    
                                    var_6_5BB = and:int(var_6_63F:int, ldc:int(-1813332586))
                                    var_11_5EA = initobject:URL(URL::<init>, invokevirtual:String(String::substring, invokevirtual:String(URL::toString, var_9_3DA:URL), and:int(ldc:int(2900), ldc:int(-2942)), sub:int(invokevirtual:int(String::length, invokevirtual:String(URL::toString, var_9_3DA:URL)), invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(5158), ldc:int(134)))))))
                                    var_6_5F2 = and:int(var_6_5BB:int, ldc:int(-471172001))
                                    var_12_5FC = invokestatic:Path(Paths::get, invokevirtual:URI(URL::toURI, var_11_5EA:URL))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_6_5F2:int, ldc:int(128)), ldc:int(0))) {
                                            var_6_60C = and:int(var_6_5F2:int, ldc:int(-2103097250))
                                        }
                                        else {
                                            var_6_60C = and:int(var_6_5F2:int, ldc:int(-1477552460))
                                            invokestatic:void(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc87f\u5db4\uff55\u446c\u3776\u7af6, var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], p3:int, p1:String, var_12_5FC:Path, p2:String, p4:Predicate<String>)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_6_60C:int, ldc:int(16777216)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_6_5F2 = and:int(var_6_60C:int, ldc:int(-1940880331))
                                    }
                                    
                                    var_6_63F = and:int(var_6_60C:int, ldc:int(-1618112548))
                                    looporswitchbreak()
                                }
                                
                                Label_1630:
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-1295909027))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(262144)), ldc:int(0))) {
                                        var_6_63F = and:int(var_6_63F:int, ldc:int(-979490312))
                                        goto(Label_1396)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1334)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(33554432)), ldc:int(0))) {
                                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1580076189))
                                        loopcontinue()
                                    }
                                    
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(-538232962))
                                }
                                
                                Label_1703:
                                
                                if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_1630)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(78141823))
                                    goto(Label_1396)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(128)), ldc:int(0))) {
                                    var_6_63F = and:int(var_6_63F:int, ldc:int(1970282061))
                                    goto(Label_1334)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1024)), ldc:int(0))) {
                                    var_6_6EE = and:int(var_6_63F:int, ldc:int(-78645514))
                                    var_11_728 = invokevirtual:Path(FileSystem::getPath, checkcast:FileSystem(java.nio.file.FileSystem.class, invokeinterface:FileSystem(Map<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>::get, getstatic:Map<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>(\u74b1\u59ec\u2dcc\u8413\u8c8a::\ub6ab\ua3b4\u7e3f\uff55\u927d\ubb2b), p0:\u983f\u6c56\u6bb9\u927d\u965f[expected:Object])), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(18577), ldc:int(-18834)))), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f))), newarray:String[](java.lang.String.class, and:int(ldc:int(3442), ldc:int(-3447))))
                                    
                                    loop {
                                        if (cmpeq:boolean(and:int(var_6_6EE:int, ldc:int(16)), ldc:int(0))) {
                                            var_6_738 = and:int(var_6_6EE:int, ldc:int(-956179360))
                                        }
                                        else {
                                            var_6_738 = and:int(var_6_6EE:int, ldc:int(-2408449))
                                            invokestatic:void(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc87f\u5db4\uff55\u446c\u3776\u7af6, var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>], p3:int, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(26760), ldc:int(618))), var_11_728:Path, p2:String, p4:Predicate<String>)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_6_738:int, ldc:int(256)), ldc:int(0))) {
                                            looporswitchbreak()
                                        }
                                        
                                        var_6_6EE = and:int(var_6_738:int, ldc:int(-833684203))
                                    }
                                    
                                    var_6_63F = and:int(var_6_738:int, ldc:int(-1754655716))
                                    looporswitchbreak()
                                }
                                
                                var_6_63F = and:int(var_6_63F:int, ldc:int(2008678849))
                            }
                            
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1058:
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-888990296))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1623197282))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_6_63F = and:int(var_6_63F:int, ldc:int(-23730588))
                            loopcontinue()
                        }
                        
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1547985068))
                    }
                    
                    Label_1123:
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1058)
                        }
                        
                        if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_6_63F = and:int(var_6_63F:int, ldc:int(-1215756298))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(16581), ldc:int(4119))))
                    }
                    
                    Label_1174:
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(128)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(1625338072))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_6_63F = and:int(var_6_63F:int, ldc:int(689955632))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_6_63F:int, ldc:int(16384)), ldc:int(0))) {
                        return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
                    }
                }
            }
            catch (java.io.FileNotFoundException | java.nio.file.NoSuchFileException ex_7A2) {
            }
            catch (java.net.URISyntaxException | java.io.IOException ex_7AB) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(10), ldc:int(175))), stack_7AB_0:Throwable)
            }
            
            return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(var_8_6D:HashSet<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
        }
        
        goto(Label_0006)
    }
    
    private static void \uc87f\u5db4\uff55\u446c\u3776\u7af6(java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, int p1, java.lang.String p2, java.nio.file.Path p3, java.lang.String p4, java.util.function.Predicate<java.lang.String> p5) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public java.io.InputStream \u946b\u8df4\ufcaf\u3776\u3bd6\ubff1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
        var_3_67 : int
        var_5_6D : String
        var_3_373 : int
        var_6_7A : InputStream
        var_7_21D : Path
        stack_2A9_0 : InputStream [generated]
        var_7_2FF : URL
        stack_38F_0 : InputStream [generated]
        
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
            var_3_67 = and:int(and:int(ldc:int(-2059387906), ldc:int(-9395366)), ldc:int(-1134513345))
            var_5_6D = invokestatic:String(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u98a4\u61a4\u4cd9\u4f4a\u4179\ub102, p0:\u983f\u6c56\u6bb9\u927d\u965f, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_3_373 = and:int(var_3_67:int, ldc:int(-714330261))
            var_6_7A = invokestatic:InputStream(\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u8640\ua3b4\u7bad\u3711\u64ab\u873d, var_5_6D:String)
            
            loop {
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0394)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(-1830611300))
                    goto(Label_0325)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(706315195))
                    goto(Label_0261)
                }
                
                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(1185443464))
                }
                else {
                    var_3_373 = and:int(var_3_373:int, ldc:int(-16899474))
                    
                    if (cmpeq:boolean(var_6_7A:InputStream, aconstnull:InputStream())) {
                        if (cmpne:boolean(getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), aconstnull:Path())) {
                            goto(Label_0325)
                        }
                        
                        goto(Label_0688)
                    }
                }
                
                Label_0198:
                
                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(-89545438))
                    goto(Label_0688)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(-1170224346))
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0325)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_373 = and:int(var_3_373:int, ldc:int(-589860242))
                }
                
                Label_0261:
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0394)
                }
                
                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(2142116756))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0325:
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0688)
                }
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(730218585))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(373035943))
                        goto(Label_0198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(-1985984997))
                        loopcontinue()
                    }
                    
                    var_3_373 = and:int(var_3_373:int, ldc:int(-2064631206))
                }
                
                Label_0394:
                
                if (cmpne:boolean(and:int(var_3_373:int, ldc:int(262144)), ldc:int(0))) {
                    var_3_373 = and:int(var_3_373:int, ldc:int(923062))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(625612570))
                        goto(Label_0325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(1983832253))
                        goto(Label_0198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(-1260473520))
                        loopcontinue()
                    }
                    
                    var_3_373 = and:int(var_3_373:int, ldc:int(-556074002))
                    var_7_21D = invokeinterface:Path(Path::resolve, getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(124), ldc:int(-125)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-32035), ldc:int(14626)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_373 = and:int(var_3_373:int, ldc:int(-1960747850))
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(512)), ldc:int(0))) {
                            var_3_373 = and:int(var_3_373:int, ldc:int(-1313801712))
                        }
                        else {
                            var_3_373 = and:int(var_3_373:int, ldc:int(-950158389))
                            
                            if (logicalnot:boolean(invokestatic:boolean(Files::exists, var_7_21D:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-788), ldc:int(787)))))) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_0600:
                        
                        if (cmpne:boolean(and:int(var_3_373:int, ldc:int(512)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(67108864)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(1902013925))
                                loopcontinue()
                            }
                            
                            var_3_373 = and:int(var_3_373:int, ldc:int(-61283398))
                        }
                        
                        try {
                            Label_0630:
                            
                            if (cmpne:boolean(and:int(var_3_373:int, ldc:int(262144)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(1168526912))
                                goto(Label_0600)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_373:int, ldc:int(2)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(-1897961794))
                                stack_2A9_0 = invokestatic:InputStream(Files::newInputStream, var_7_21D:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-21397), ldc:int(21252))))
                                var_3_373 = and:int(var_3_373:int, ldc:int(-151389377))
                                return:InputStream(stack_2A9_0:InputStream)
                            }
                            
                            loopcontinue()
                        }
                        catch (java.io.IOException stack_2AE_0) {
                        }
                        
                        looporswitchbreak()
                    }
                }
                
                try {
                    Label_0688:
                    
                    if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(-2063211654))
                        goto(Label_0394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(1753058207))
                        goto(Label_0261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_373 = and:int(var_3_373:int, ldc:int(-974734786))
                        var_7_2FF = invokevirtual:URL(Class<T>::getResource, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), var_5_6D:String)
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0854)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(1059027677))
                            }
                            else {
                                var_3_373 = and:int(var_3_373:int, ldc:int(-691127329))
                                
                                if (logicalnot:boolean(invokestatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc29a\u93a2\u3504\u183a\uc229\u3bc9, var_5_6D:String, var_7_2FF:URL))) {
                                    stack_38F_0 = aconstnull:InputStream()
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_0809:
                            
                            if (cmpne:boolean(and:int(var_3_373:int, ldc:int(1024)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(-862604476))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_3_373:int, ldc:int(2)), ldc:int(0))) {
                                    var_3_373 = and:int(var_3_373:int, ldc:int(-1511125314))
                                    loopcontinue()
                                }
                                
                                var_3_373 = and:int(var_3_373:int, ldc:int(-2039971905))
                                
                                if (logicalnot:boolean(getstatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uff55\u3c25\u51fa\uf9c5\u4daf\u4f52))) {
                                    stack_38F_0 = invokevirtual:InputStream(URL::openStream, var_7_2FF:URL)
                                    looporswitchbreak()
                                }
                            }
                            
                            Label_0854:
                            
                            if (cmpne:boolean(and:int(var_3_373:int, ldc:int(33554432)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(-1078549013))
                                goto(Label_0809)
                            }
                            
                            if (cmpne:boolean(and:int(var_3_373:int, ldc:int(2)), ldc:int(0))) {
                                var_3_373 = and:int(var_3_373:int, ldc:int(-1388221669))
                                stack_38F_0 = invokespecial:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u8bb0\u5bc4\u3d64\ub18d\u5245\ubefe, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, p0:\u983f\u6c56\u6bb9\u927d\u965f, var_5_6D:String)
                                looporswitchbreak()
                            }
                        }
                        
                        return:InputStream(stack_38F_0:InputStream)
                    }
                    
                    var_3_373 = and:int(var_3_373:int, ldc:int(318154722))
                }
                catch (java.io.IOException var_7_394) {
                    return:InputStream(invokevirtual:InputStream(Class<T>::getResourceAsStream, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), var_5_6D:String))
                }
            }
            
            return:InputStream(var_6_7A:InputStream)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u98a4\u61a4\u4cd9\u4f4a\u4179\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(6689), ldc:int(-6962)))), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(11152), ldc:int(-27537)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-26200), ldc:int(25111)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \uc29a\u93a2\u3504\u183a\uc229\u3bc9(java.lang.String p0, java.net.URL p1) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p1:URL, aconstnull:URL()), logicalor:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(URL::getProtocol, p1:URL), loadelement:String[expected:Object](getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(39), ldc:int(16647)))), invokestatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u8cae\u9af2\u0c95\u3bc9\u74b1\u9033, initobject:File(File::<init>, invokevirtual:String(URL::getFile, p1:URL)), p0:String))), xor:int(ldc:int(4169), ldc:int(4168)), and:int(ldc:int(13666), ldc:int(-13667))))
        }
        
        goto(Label_0006)
    }
    
    public java.io.InputStream \u946b\u8df4\ufcaf\u3776\u3bd6\ubff1(java.lang.String p0) {
        var_2_61 : int
        stack_BF_0 : InputStream [generated]
        
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
            var_2_61 = and:int(ldc:int(-420659458), ldc:int(-488595501))
            
            if (logicalnot:boolean(getstatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uff55\u3c25\u51fa\uf9c5\u4daf\u4f52))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-495306030))
                stack_BF_0 = invokevirtual:InputStream(Class<T>::getResourceAsStream, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(17065), ldc:int(-19114)))), p0:String)))
            }
            else {
                stack_BF_0 = invokespecial:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u8bb0\u5bc4\u3d64\ub18d\u5245\ubefe, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, getstatic:\u983f\u6c56\u6bb9\u927d\u965f(\u983f\u6c56\u6bb9\u927d\u965f::\u416d\uceb8\u4f4a\u624e\u4daf\u120d), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(32272), ldc:int(-32275)))), p0:String)))
            }
            
            return:InputStream(stack_BF_0:InputStream)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u718f\u52d3\u12b2\u93a2\u4179\u97b7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
        var_3_67 : int
        var_5_6D : String
        var_3_25E : int
        var_6_7A : InputStream
        var_7_1E1 : Path
        var_7_257 : URL
        stack_26C_0 : boolean [generated]
        
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
        var_3_67 = and:int(and:int(ldc:int(885459245), ldc:int(2133706605)), ldc:int(2143240157))
        var_5_6D = invokestatic:String(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u98a4\u61a4\u4cd9\u4f4a\u4179\ub102, p0:\u983f\u6c56\u6bb9\u927d\u965f, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        var_3_25E = and:int(var_3_67:int, ldc:int(2129500063))
        var_6_7A = invokestatic:InputStream(\ub1b9\u4c04\u8cae\u8cae\u647c\u51b2::\u8640\ua3b4\u7bad\u3711\u64ab\u873d, var_5_6D:String)
        
        loop {
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0342)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-1374239663))
                goto(Label_0298)
            }
            
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0235)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-1764508910))
            }
            else {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-65670145))
                
                if (cmpeq:boolean(var_6_7A:InputStream, aconstnull:InputStream())) {
                    if (cmpne:boolean(getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), aconstnull:Path())) {
                        goto(Label_0298)
                    }
                    
                    looporswitchbreak()
                }
            }
            
            Label_0181:
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0342)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(536870912)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-622907225))
                goto(Label_0298)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(8)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-1705203864))
            }
            else {
                if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(33554432)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_25E = and:int(var_3_25E:int, ldc:int(-1136757795))
            }
            
            Label_0235:
            
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0342)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(16)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_25E = and:int(var_3_25E:int, ldc:int(-683717626))
                    goto(Label_0181)
                }
                
                if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(33), ldc:int(17025)))
                }
                
                loopcontinue()
            }
            
            Label_0298:
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(249289680))
            }
            else {
                if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0181)
                }
                
                if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(524288)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_25E = and:int(var_3_25E:int, ldc:int(-46776353))
            }
            
            Label_0342:
            
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(32768)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(916723640))
                goto(Label_0298)
            }
            
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(32768)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(-627235316))
                goto(Label_0235)
            }
            
            if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(524288)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(1251170471))
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(1)), ldc:int(0))) {
                var_3_25E = and:int(var_3_25E:int, ldc:int(2064108519))
            }
            else {
                var_3_25E = and:int(var_3_25E:int, ldc:int(876435839))
                var_7_1E1 = invokeinterface:Path(Path::resolve, getstatic:Path(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u3c25\u873d\uc2bd\u3bd6\uc229\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, p0:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-2402), ldc:int(2401)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(21062), ldc:int(-29256)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))))
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_25E = and:int(var_3_25E:int, ldc:int(1501582044))
                    }
                    else {
                        var_3_25E = and:int(var_3_25E:int, ldc:int(-36386481))
                        
                        if (logicalnot:boolean(invokestatic:boolean(Files::exists, var_7_1E1:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(10593), ldc:int(-10600)))))) {
                            looporswitchbreak(Label_0592)
                        }
                    }
                    
                    Label_0531:
                    
                    if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_25E = and:int(var_3_25E:int, ldc:int(68704775))
                            loopcontinue()
                        }
                        
                        var_3_25E = and:int(var_3_25E:int, ldc:int(-1226407139))
                    }
                    
                    Label_0560:
                    
                    if (cmpeq:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_25E:int, ldc:int(256)), ldc:int(0))) {
                        return:boolean(xor:int[expected:boolean](ldc:int(-32740), ldc:int(-32739)))
                    }
                }
            }
        }
        
        try {
            Label_0592:
            var_7_257 = invokevirtual:URL(Class<T>::getResource, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), var_5_6D:String)
            var_3_25E = and:int(var_3_25E:int, ldc:int(-1232641633))
            stack_26C_0 = invokestatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc29a\u93a2\u3504\u183a\uc229\u3bc9, var_5_6D:String, var_7_257:URL)
            var_3_25E = and:int(var_3_25E:int, ldc:int(913197885))
            return:boolean(stack_26C_0:boolean)
        }
        catch (java.io.IOException var_7_271) {
            return:boolean(and:int[expected:boolean](ldc:int(20997), ldc:int(-22022)))
        }
    }
    
    public java.util.Set<java.lang.String> \u8389\ubcb0\u600f\u392e\u927d\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0) {
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
            return:Set<String>(getfield:Set<String>(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u183a\u6435\u92ff\u47c2\u960f\ua068, this:\u74b1\u59ec\u2dcc\u8413\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    public T \u624e\ub8be\u4c2b\uc84e\u4975\u6fb0(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ub113\u8350\u839e\ubb2b\ub83f<T> p0) {
        var_4_77 : InputStream
        var_5_7A : Throwable
        var_6_B6 : Throwable
        var_9_DB : Throwable
        
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
        
        try {
            var_4_77 = invokevirtual:InputStream(\u74b1\u59ec\u2dcc\u8413\u8c8a::\uc246\u9af2\uafe7\u9033\u5d20\ubcb0, this:\u74b1\u59ec\u2dcc\u8413\u8c8a, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(11), ldc:int(2863))))
            var_5_7A = aconstnull:Throwable()
            
            try {
                return:T(invokestatic:T(\u760c\ua3b4\u99f7\u7330\u4975::\u76bc\u759a\u47c2\u61a4\ud4fe\u3c25, p0:\ub113\u8350\u839e\ubb2b\ub83f<T>, var_4_77:InputStream))
            }
            catch (java.lang.Throwable var_6_B6) {
                var_5_7A = var_6_B6:Throwable
                athrow(var_6_B6:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_77:InputStream, aconstnull:InputStream())) {
                    if (cmpne:boolean(var_5_7A:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(InputStream::close, var_4_77:InputStream)
                        }
                        catch (java.lang.Throwable var_9_DB) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_7A:Throwable, var_9_DB:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(InputStream::close, var_4_77:InputStream)
                    }
                }
            }
        }
        catch (java.lang.RuntimeException | java.io.FileNotFoundException ex_F7) {
            return:T(aconstnull:T())
        }
    }
    
    public java.lang.String \u8cae\u7d52\u647c\u3bd6\u0c95\u965f() {
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
            return:String(loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(13345), ldc:int(13357))))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u8cae\u9af2\u0c95\u3bc9\u74b1\u9033(java.io.File p0, java.lang.String p1) {
        var_4_66 : String
        
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
        var_4_66 = invokevirtual:String(File::getPath, p0:File)
        
        if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_66:String, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), xor:int(ldc:int(15363), ldc:int(15374)))))) {
            return:boolean(invokestatic:boolean(\u69d9\u9255\u6d99\ubff1\u0c95::\u6d69\u8aa5\u983f\ud158\ub171\u718f, p0:File, p1:String))
        }
        
        if (getstatic:boolean(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u6c56\uc910\u1833\ube23\u40a9\u8753)) {
            var_4_66 = invokevirtual:String(String::replace, var_4_66:String, loadelement:String[expected:CharSequence](getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(18549), ldc:int(4737))), loadelement:String[expected:CharSequence](getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(19308), ldc:int(-19310))))
        }
        
        return:boolean(invokevirtual:boolean(String::endsWith, var_4_66:String, p1:String))
    }
    
    private java.io.InputStream \u8bb0\u5bc4\u3d64\ub18d\u5245\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u983f\u6c56\u6bb9\u927d\u965f p0, java.lang.String p1) {
        var_3_61 : int
        var_5_74 : FileSystem
        stack_CF_0 : InputStream [generated]
        
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
        var_3_61 = and:int(ldc:int(330908351), ldc:int(-1019732290))
        
        try {
            var_3_61 = and:int(var_3_61:int, ldc:int(1262418858))
            var_5_74 = checkcast:FileSystem(java.nio.file.FileSystem.class, invokeinterface:FileSystem(Map<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>::get, getstatic:Map<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>(\u74b1\u59ec\u2dcc\u8413\u8c8a::\ub6ab\ua3b4\u7e3f\uff55\u927d\ubb2b), p0:\u983f\u6c56\u6bb9\u927d\u965f[expected:Object]))
            
            do {
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(32)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-841324978))
                }
                else {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1903975274))
                    
                    if (cmpne:boolean(var_5_74:FileSystem, aconstnull:FileSystem())) {
                        loopcontinue()
                    }
                    
                    stack_CF_0 = invokevirtual:InputStream(Class<T>::getResourceAsStream, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), p1:String)
                    Label_0201:
                    var_3_61 = and:int(var_3_61:int, ldc:int(1261977391))
                    return:InputStream(stack_CF_0:InputStream)
                }
            } while (cmpne:boolean(and:int(var_3_61:int, ldc:int(4096)), ldc:int(0)))
            
            var_3_61 = and:int(var_3_61:int, ldc:int(369093486))
            stack_CF_0 = invokestatic:InputStream(Files::newInputStream, invokevirtual:Path(FileSystem::getPath, var_5_74:FileSystem, p1:String, newarray:String[](java.lang.String.class, and:int(ldc:int(25352), ldc:int(-25353)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(555), ldc:int(-4652))))
            goto(Label_0201)
        }
        catch (java.io.IOException var_5_D4) {
            return:InputStream(invokevirtual:InputStream(Class<T>::getResourceAsStream, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), p1:String))
        }
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u36d3\u7ce1\u5d20\ub19c\u7049\ub7dc$2(java.lang.String p0, java.nio.file.Path p1, java.nio.file.Path p2) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, p0:String, invokevirtual:String(String::replaceAll, invokeinterface:String(Path::toString, invokeinterface:Path(Path::relativize, p1:Path, p2:Path)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(15), ldc:int(29742))), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(2974), ldc:int(-2976))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u72f1\uc87f\ua068\u67e9\ubb2b\ua3b4$1(java.util.function.Predicate p0, java.nio.file.Path p1) {
        var_2_61 : int
        stack_CA_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1307895421), ldc:int(1281738461))
            
            if (logicalnot:boolean(invokeinterface:boolean(Path::endsWith, p1:Path, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(47), ldc:int(847)))))) {
                if (invokestatic:boolean(Files::isRegularFile, p1:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-23746), ldc:int(21697))))) {
                    if (invokeinterface:boolean(Predicate<String>::test, p0:Predicate<String>, invokeinterface:String(Path::toString, invokeinterface:Path(Path::getFileName, p1:Path)))) {
                        stack_CA_0 = and:int[expected:boolean](ldc:int(10243), ldc:int(1317))
                        return:boolean(stack_CA_0:boolean)
                    }
                }
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1478056194))
            stack_CA_0 = and:int[expected:boolean](ldc:int(-7659), ldc:int(2536))
            return:boolean(stack_CA_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u839e\ua562\u6d69\ub1b9\u416d\u836c$0(java.util.HashMap p0) {
        var_1_67 : int
        var_3_6B : Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>
        var_4_76 : \u983f\u6c56\u6bb9\u927d\u965f[]
        var_5_7B : int
        var_6_84 : int
        var_7_D8 : \u983f\u6c56\u6bb9\u927d\u965f
        var_8_10D : URL
        var_9_114 : URI
        var_10_131 : FileSystem
        stack_156_0 : Throwable [generated]
        
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
            var_1_67 = and:int(and:int(ldc:int(-873142659), ldc:int(-67635523)), ldc:int(-84023297))
            monitorenter(var_3_6B = ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class))
            
            try {
                var_1_67 = and:int(var_1_67:int, ldc:int(1846699967))
                var_4_76 = invokestatic:\u983f\u6c56\u6bb9\u927d\u965f[](\u983f\u6c56\u6bb9\u927d\u965f::values)
                var_5_7B = arraylength:int(var_4_76:\u983f\u6c56\u6bb9\u927d\u965f[])
                var_6_84 = and:int(ldc:int(1075), ldc:int(-1076))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(8)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-568137263))
                        goto(Label_0377)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(1798471679))
                        
                        if (cmpge:boolean(var_6_84:int, var_5_7B:int)) {
                            monitorexit(var_3_6B:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>)
                            goto(Label_0377)
                        }
                    }
                    
                    Label_0172:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_67 = and:int(var_1_67:int, ldc:int(-1982664216))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_67:int, ldc:int(256)), ldc:int(0))) {
                            var_1_67 = and:int(var_1_67:int, ldc:int(1639554816))
                            loopcontinue()
                        }
                        
                        var_1_67 = and:int(var_1_67:int, ldc:int(448491325))
                        var_7_D8 = loadelement:\u983f\u6c56\u6bb9\u927d\u965f(var_4_76:\u983f\u6c56\u6bb9\u927d\u965f[], var_6_84:int)
                        var_8_10D = invokevirtual:URL(Class<T>::getResource, ldc:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a.class), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(-23626), ldc:int(7177)))), invokevirtual:String(\u983f\u6c56\u6bb9\u927d\u965f::\u7330\u8df4\uc29a\u92ff\u8640\ubff1, var_7_D8:\u983f\u6c56\u6bb9\u927d\u965f)), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(2062), ldc:int(17061))))))
                        
                        try {
                            var_9_114 = invokevirtual:URI(URL::toURI, var_8_10D:URL)
                            
                            if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(7), ldc:int(6303))), invokevirtual:String(URI::getScheme, var_9_114:URI))) {
                                try {
                                    var_10_131 = invokestatic:FileSystem(FileSystems::getFileSystem, var_9_114:URI)
                                }
                                catch (java.nio.file.FileSystemNotFoundException var_11_13A) {
                                    var_10_131 = invokestatic:FileSystem(FileSystems::newFileSystem, var_9_114:URI, invokestatic:Map<String, ?>(Collections::emptyMap))
                                }
                                
                                invokevirtual:FileSystem(HashMap<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>::put, p0:HashMap<\u983f\u6c56\u6bb9\u927d\u965f, FileSystem>, var_7_D8:\u983f\u6c56\u6bb9\u927d\u965f, var_10_131:FileSystem)
                            }
                        }
                        catch (java.net.URISyntaxException | java.io.IOException ex_156) {
                            invokeinterface:void(Logger::error, getstatic:Logger(\u74b1\u59ec\u2dcc\u8413\u8c8a::\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56), loadelement:String(getstatic:String[](\u74b1\u59ec\u2dcc\u8413\u8c8a::\u946b\u416d\u71ae\ua61f\u4cd9\u12b2), and:int(ldc:int(14), ldc:int(26763))), stack_156_0:Throwable)
                        }
                        
                        inc:int(var_6_84, ldc:int(1))
                        loopcontinue()
                    }
                    
                    Label_0377:
                    
                    if (cmpeq:boolean(and:int(var_1_67:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0172)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_67:int, ldc:int(1)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_67 = and:int(var_1_67:int, ldc:int(-1954328713))
                }
                
                var_1_67 = and:int(var_1_67:int, ldc:int(1863937791))
            }
            finally {
                monitorexit(var_3_6B:Class<\u74b1\u59ec\u2dcc\u8413\u8c8a>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ub19c\u3bc9\uc84e\u71ae\u836c\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_671 : int
        
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
        var_3_666 = and:int(ldc:int(-1739455996), ldc:int(-134987003))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u74b1\u59ec\u2dcc\u8413\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(573823979))
        }
        else {
            var_3_666 = and:int(var_3_666:int, ldc:int(-663736449))
            var_5_89 = and:int(ldc:int(15508), ldc:int(-32413))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29840), ldc:int(-29877)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_666:int, ldc:int(-1319339103))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, xor:int(ldc:int(28928), ldc:int(28929)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(13), ldc:int(273)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_D9:int, ldc:int(-22726326))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(2069), ldc:int(2068)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-877070783))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-844218781))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1133473228))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(774020776))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1602315152))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(780801022))
                    }
                    else {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1091663599))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1984715329))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-537103408))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-481893070))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-92238040))
                            var_11_EA = and:int(ldc:int(-18844), ldc:int(18459))
                            goto(Label_1521)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1518554389))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1856829780))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1211363757))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-28362054))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0813)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1168132743))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1579595738))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-183838278))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(139267962))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1702056756))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0813:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1722939330))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2115352162))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1003622154))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-766339126))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = and:int(ldc:int(3649), ldc:int(12473))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0922:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1590871172))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1668189359))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-291774972))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(745356623))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-13380680))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(231644299))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(875256239))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-561676145))
                        var_11_EA = and:int(ldc:int(-4024), ldc:int(3847))
                    }
                    
                    Label_1104:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1190530735))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-130724361))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1756669177))
                            goto(Label_0922)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-188769445))
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(744400524))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1710256053))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1233:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1104)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(2106178069))
                            goto(Label_0922)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0813)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(377270315))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(256)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-545822072))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(623441909))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1074240808))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1521)
                    }
                    
                    Label_1363:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1516854983))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1450462127))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1173716351))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1297963536))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(791759926))
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1859418842))
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1290837872))
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-1691815600))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1332729842))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-800788914))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0813)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1703221637))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1112269092))
                        var_17_671 = add:int(var_16_118:int, xor:int(ldc:int(-16255), ldc:int(-16256)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(1255237319))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(-1174304531))
                
                if (cmple:boolean(var_5_89 = var_17_671:int, sub:int(var_6_90:int, xor:int(ldc:int(1026), ldc:int(1027))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
