public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u6198\u71f1\u8df4\u71f1\u7d52\u6c56 {
    public void \u6198\u71f1\u8df4\u71f1\u7d52\u6c56() {
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
            invokespecial:Object(Object::<init>, this:\u6198\u71f1\u8df4\u71f1\u7d52\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u3d4b\u74b1\u8aa5\u16f6\u6d69\u7e3f(java.nio.file.Path p0, java.lang.String p1, java.lang.String p2) {
        var_3_64 : int
        var_5_68 : char[]
        var_6_6D : int
        var_7_76 : int
        var_3_EE : int
        var_8_F4 : char
        var_3_586 : int
        var_5_273 : Matcher
        var_3_5A3 : int
        var_7_5A5 : String
        var_3_63E : int
        var_8_66A : String
        var_3_670 : int
        var_9_67E : int
        var_3_7A4 : int
        var_8_7AD : Path
        var_9_7C3 : Path
        stack_7FD_0 : String [generated]
        var_3_808 : int
        
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
        var_3_64 = and:int(and:int(ldc:int(-1259414146), ldc:int(-1762427020)), ldc:int(-556343298))
        var_5_68 = getstatic:char[](\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u99f7\u3504\u62da\uc910\u7c6b\u59ec)
        var_6_6D = arraylength:int(var_5_68:char[])
        var_7_76 = and:int(ldc:int(29740), ldc:int(-31791))
        
        loop {
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(4)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(-566741950))
                goto(Label_0449)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0324)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(-515853769))
            }
            else {
                var_3_64 = and:int(var_3_64:int, ldc:int(-582058148))
                
                if (cmpge:boolean(var_7_76:int, var_6_6D:int)) {
                    p1 = invokevirtual:String(String::replaceAll, p1:String, loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), and:int(ldc:int(5667), ldc:int(-22072))), loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), xor:int(ldc:int(16680), ldc:int(16681))))
                    goto(Label_0324)
                }
            }
            
            Label_0183:
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0449)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(16)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(401878361))
                goto(Label_0401)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-936217562))
                    loopcontinue()
                }
                
                var_3_EE = and:int(var_3_64:int, ldc:int(-191636097))
                var_8_F4 = loadelement:char(var_5_68:char[], var_7_76:int)
                
                do {
                    if (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_EE = and:int(var_3_EE:int, ldc:int(1459923991))
                    }
                    else {
                        var_3_EE = and:int(var_3_EE:int, ldc:int(-1220032676))
                        p1 = invokevirtual:String(String::replace, p1:String, var_8_F4:char, ldc:char(95))
                    }
                } while (cmpeq:boolean(and:int(var_3_EE:int, ldc:int(1024)), ldc:int(0)))
                
                var_3_64 = and:int(var_3_EE:int, ldc:int(-1231403146))
                inc:int(var_7_76, ldc:int(1))
                loopcontinue()
            }
            
            Label_0324:
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(1070395415))
                goto(Label_0449)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(842243609))
            }
            else {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1324850673))
                    goto(Label_0183)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(1024)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_64 = and:int(var_3_64:int, ldc:int(-1098195074))
                
                if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\uf9c5\u97b7\u71ae\u8258\u97e6\u6b5f), p1:String[expected:CharSequence])))) {
                    goto(Label_0564)
                }
            }
            
            Label_0401:
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(256)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(90172556))
                goto(Label_0564)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0324)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0183)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_64 = and:int(var_3_64:int, ldc:int(-1097107618))
            }
            
            Label_0449:
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1715118653))
                    goto(Label_0401)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-832178009))
                    goto(Label_0324)
                }
                
                if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(4)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1829713206))
                    goto(Label_0183)
                }
                
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_64 = and:int(var_3_64:int, ldc:int(-1401157089))
                    loopcontinue()
                }
                
                var_3_64 = and:int(var_3_64:int, ldc:int(-1137027722))
                p1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), xor:int(ldc:int(-28152), ldc:int(-28151)))), p1:String), loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), and:int(ldc:int(21), ldc:int(8713)))))
            }
            
            Label_0564:
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0449)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(8192)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(-1689422217))
                goto(Label_0401)
            }
            
            if (cmpeq:boolean(and:int(var_3_64:int, ldc:int(256)), ldc:int(0))) {
                var_3_64 = and:int(var_3_64:int, ldc:int(456527815))
                goto(Label_0324)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0183)
            }
            
            if (cmpne:boolean(and:int(var_3_64:int, ldc:int(4)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        var_3_586 = and:int(var_3_64:int, ldc:int(-708065826))
        var_5_273 = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\ubcb0\u5245\u61a4\u446c\u446c\ub6ab), p1:String[expected:CharSequence])
        
        loop {
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(1036983218))
                goto(Label_1337)
            }
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-1465995876))
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1130)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(1770065355))
                goto(Label_1023)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0912)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(648039559))
                goto(Label_0826)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(1)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-65046666))
                var_6_6D = and:int(ldc:int(934), ldc:int(-19431))
            }
            
            Label_0724:
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(1024)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-375615487))
                goto(Label_1337)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-890576451))
                goto(Label_1130)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-427756394))
                goto(Label_1023)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-540391157))
                goto(Label_0912)
            }
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(131072)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(14623334))
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-3152419))
                
                if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, var_5_273:Matcher))) {
                    goto(Label_1130)
                }
            }
            
            Label_0826:
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1337)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-2133271418))
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(131072)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-150148878))
                goto(Label_1130)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1023)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(-77313733))
                    goto(Label_0724)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(-431438193))
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-1661053610))
            }
            
            Label_0912:
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1048576)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-1273754427))
                goto(Label_1337)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1130)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(64)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(450308790))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(-1302882520))
                    goto(Label_0826)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(470022825))
                    goto(Label_0724)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(64)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(1326087768))
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-1246016139))
                p1 = invokevirtual:String(Matcher::group, var_5_273:Matcher, loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), xor:int(ldc:int(6276), ldc:int(6278))))
            }
            
            Label_1023:
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1337)
            }
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-1071143839))
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(256)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-639979595))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0912)
                }
                
                if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(1852893955))
                    goto(Label_0826)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(1945840748))
                    goto(Label_0724)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-1810643497))
                var_6_6D = invokestatic:int(Integer::parseInt, invokevirtual:String(Matcher::group, var_5_273:Matcher, loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), and:int(ldc:int(6543), ldc:int(8307)))))
            }
            
            Label_1130:
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(2022988763))
                goto(Label_1337)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16384)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(1528475848))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(-37645638))
                    goto(Label_1023)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(616439180))
                    goto(Label_0912)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(1896290532))
                    goto(Label_0826)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(-1958969429))
                    goto(Label_0724)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-40744971))
                
                if (cmple:boolean(invokevirtual:int(String::length, p1:String), sub:int(and:int(ldc:int(16895), ldc:int(11007)), invokevirtual:int(String::length, p2:String)))) {
                    looporswitchbreak()
                }
            }
            
            Label_1251:
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_1130)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(149058988))
                    goto(Label_1023)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(161840100))
                    goto(Label_0912)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(256)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(2110575392))
                    goto(Label_0826)
                }
                
                if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(64)), ldc:int(0))) {
                    var_3_586 = and:int(var_3_586:int, ldc:int(29062781))
                    goto(Label_0724)
                }
                
                if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_586 = and:int(var_3_586:int, ldc:int(-1616224300))
            }
            
            Label_1337:
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1251)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(202204332))
                goto(Label_1130)
            }
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_1023)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(790896833))
                goto(Label_0912)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0826)
            }
            
            if (cmpeq:boolean(and:int(var_3_586:int, ldc:int(16384)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(1069765792))
                goto(Label_0724)
            }
            
            if (cmpne:boolean(and:int(var_3_586:int, ldc:int(256)), ldc:int(0))) {
                var_3_586 = and:int(var_3_586:int, ldc:int(-1650010113))
                p1 = invokevirtual:String(String::substring, p1:String, and:int(ldc:int(1359), ldc:int(-1360)), sub:int(and:int(ldc:int(6655), ldc:int(8959)), invokevirtual:int(String::length, p2:String)))
                looporswitchbreak()
            }
        }
        
        loop {
            var_3_5A3 = and:int(var_3_586:int, ldc:int(-163872931))
            var_7_5A5 = p1:String
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(256)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(507986196))
                    goto(Label_1924)
                }
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1862)
                }
                
                if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-951130900))
                    goto(Label_1558)
                }
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(4)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-1332512484))
                }
                else {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-1658685961))
                    
                    if (cmpeq:boolean(var_6_6D:int, ldc:int(0))) {
                        goto(Label_1862)
                    }
                }
                
                Label_1509:
                
                if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1924)
                }
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1862)
                }
                
                if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(1048576)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(468270912))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5A3 = and:int(var_3_5A3:int, ldc:int(1140278062))
                        loopcontinue()
                    }
                    
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-21528739))
                }
                
                Label_1558:
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-219140245))
                    goto(Label_1924)
                }
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63E = and:int(var_3_5A3:int, ldc:int(-1238370988))
                    var_8_66A = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), xor:int(ldc:int(0), ldc:int(4)))), var_6_6D:int), loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), and:int(ldc:int(4101), ldc:int(53)))))
                    var_3_670 = and:int(var_3_63E:int, ldc:int(-1631662724))
                    var_9_67E = sub:int(xor:int(ldc:int(905), ldc:int(886)), invokevirtual:int(String::length, var_8_66A:String))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(1286475522))
                            goto(Label_1806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-1150364703))
                            goto(Label_1765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-1089315337))
                            
                            if (cmple:boolean(invokevirtual:int(String::length, p1:String), var_9_67E:int)) {
                                goto(Label_1806)
                            }
                        }
                        
                        Label_1715:
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-837691352))
                            goto(Label_1806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_670 = and:int(var_3_670:int, ldc:int(-2046172091))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                                var_3_670 = and:int(var_3_670:int, ldc:int(2029410615))
                                loopcontinue()
                            }
                            
                            var_3_670 = and:int(var_3_670:int, ldc:int(-706773516))
                        }
                        
                        Label_1765:
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(67108864)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_1715)
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_670 = and:int(var_3_670:int, ldc:int(-1797601419))
                            var_7_5A5 = invokevirtual:String(String::substring, p1:String, and:int(ldc:int(992), ldc:int(-1001)), var_9_67E:int)
                        }
                        
                        Label_1806:
                        
                        if (cmpeq:boolean(and:int(var_3_670:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1715)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_670:int, ldc:int(268435456)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_3_670 = and:int(var_3_670:int, ldc:int(2037308395))
                    }
                    
                    var_3_5A3 = and:int(var_3_670:int, ldc:int(-1641658923))
                    var_7_5A5 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_7_5A5:String), var_8_66A:String))
                }
                
                Label_1862:
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(755341845))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5A3 = and:int(var_3_5A3:int, ldc:int(-1778723372))
                    var_7_5A5 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_7_5A5:String), p2:String))
                }
                
                Label_1924:
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_1862)
                }
                
                if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1558)
                }
                
                if (cmpeq:boolean(and:int(var_3_5A3:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1509)
                }
                
                if (cmpne:boolean(and:int(var_3_5A3:int, ldc:int(64)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_7A4 = and:int(var_3_5A3:int, ldc:int(-722571946))
            var_8_7AD = invokeinterface:Path(Path::resolve, p0:Path, var_7_5A5:String)
            
            try {
                var_3_7A4 = and:int(var_3_7A4:int, ldc:int(-596130436))
                var_9_7C3 = invokestatic:Path(Files::createDirectory, var_8_7AD:Path, newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(21515), ldc:int(-31756))))
                
                do {
                    if (cmpeq:boolean(and:int(var_3_7A4:int, ldc:int(64)), ldc:int(0))) {
                        var_3_7A4 = and:int(var_3_7A4:int, ldc:int(1127677072))
                    }
                    else {
                        var_3_7A4 = and:int(var_3_7A4:int, ldc:int(-1111337129))
                        invokestatic:boolean(Files::deleteIfExists, var_9_7C3:Path)
                    }
                } while (cmpne:boolean(and:int(var_3_7A4:int, ldc:int(8192)), ldc:int(0)))
                
                var_3_7A4 = and:int(var_3_7A4:int, ldc:int(-691012106))
                stack_7FD_0 = invokeinterface:String(Path::toString, invokeinterface:Path(Path::relativize, p0:Path, var_9_7C3:Path))
                var_3_7A4 = and:int(var_3_7A4:int, ldc:int(-152404522))
                return:String(stack_7FD_0:String)
            }
            catch (java.nio.file.FileAlreadyExistsException var_9_802) {
                var_3_808 = and:int(var_3_7A4:int, ldc:int(-551332516))
                inc:int(var_6_6D, ldc:int(1))
                var_3_586 = and:int(var_3_808:int, ldc:int(-1748605092))
            }
        }
    }
    
    public static boolean \u12cb\ub83f\ucb79\u385b\u0a06\u3a62(java.nio.file.Path p0) {
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
            return:boolean(invokeinterface:boolean(Path::equals, invokeinterface:Path(Path::normalize, p0:Path), p0:Path[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \uc2e8\ub102\u416d\u416d\u5245\u4d85(java.nio.file.Path p0) {
        var_1_61 : int
        var_3_68 : Iterator<Path>
        
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
        var_1_61 = and:int(ldc:int(670474161), ldc:int(-1417742415))
        var_3_68 = invokeinterface:Iterator<Path>(Path::iterator, p0:Path)
        
        loop {
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2082562161))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(1802925051))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_68:Iterator<Path>)) {
                    if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\uf9c5\u97b7\u71ae\u8258\u97e6\u6b5f), invokeinterface:String(Path::toString, checkcast:Path(java.nio.file.Path.class, invokeinterface:Path(Iterator<Path>::next, var_3_68:Iterator<Path>))))))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1686816772))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(21588), ldc:int(-22101)))
                }
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(8197), ldc:int(17281)))
            }
        }
    }
    
    public static java.nio.file.Path \uc7fe\uc910\uc31c\ua3b4\u5f50\u8d98(java.nio.file.Path p0, java.lang.String p1, java.lang.String p2) {
        var_5_74 : String
        var_6_85 : Path
        
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
        var_5_74 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p1:String), p2:String))
        var_6_85 = invokestatic:Path(Paths::get, var_5_74:String, newarray:String[](java.lang.String.class, and:int(ldc:int(17423), ldc:int(-17680))))
        
        if (logicalnot:boolean(invokeinterface:boolean(Path::endsWith, var_6_85:Path, p2:String))) {
            return:Path(invokeinterface:Path(Path::resolve, p0:Path, var_6_85:Path))
        }
        
        athrow(initobject:InvalidPathException(InvalidPathException::<init>, var_5_74:String, loadelement:String(getstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1), and:int(ldc:int(1070), ldc:int(2694)))))
    }
    
    static {
        var_0_284 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_127_0 : byte[] [generated]
        stack_297_0 : byte[] [generated]
        stack_2F6_0 : byte[] [generated]
        stack_370_0 : byte[] [generated]
        stack_3C6_0 : byte[] [generated]
        var_4_270 : int
        var_3_275 : byte[]
        var_5_276 : int
        expr_29A : byte [generated]
        var_0_30F : int
        expr_2F6 : byte [generated]
        stack_33E_2 : byte [generated]
        stack_312_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_D3 : byte[]
        expr_D7 : int [generated]
        var_3_35E : byte[]
        var_5_35F : int
        expr_FD : int [generated]
        var_3_3B4 : byte[]
        var_5_3B5 : int
        var_3_133 : String
        expr_13B : String[] [generated]
        expr_145 : String[] [generated]
        var_3_242 : String[]
        
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
        var_0_284 = and:int(ldc:int(1922394212), ldc:int(2120220084))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D3_0 = stack_D5_0 = stack_FB_0 = stack_FD_0 = stack_127_0 = stack_297_0 = stack_2F6_0 = stack_370_0 = stack_3C6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("u8Ut+a+rTD6OraIJu1TNHRPTsbNShPVIOA+xVK+nD6ntpTDTwc2/EZZItZyr3V7v5UrDC7dgmPmgYtcDklin+aJKw9F8TMEFJYpivbVyTsEFlFTLyfGGTLGt0w+QUpwNGb/JxbGzoprHu8MGnC+vt7HBiogyty+nq62vravNtZQ=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_270 = expr_6E:int
        var_3_275 = newarray:byte[](byte.class, expr_6E:int)
        var_5_276 = expr_6E:int
        Label_0632:
        
        while (cmpne:boolean(and:int(var_0_284:int, ldc:int(8192)), ldc:int(0))) {
            var_0_284 = and:int(var_0_284:int, ldc:int(-55609036))
            var_5_276 = add:int(var_5_276:int, ldc:int(-1))
            expr_29A = add:byte(loadelement:byte(stack_297_0:byte[], var_5_276:int), ldc:byte(91))
            storeelement:byte(var_3_275:byte[], var_5_276:int, or:int(and:int(shl:int(expr_29A:byte, xor:int(ldc:int(6), ldc:int(2))), ldc:int(-16)), and:int(shr:int(expr_29A:byte[expected:int], xor:int(ldc:int(1296), ldc:int(1300))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_276:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_FB_0 = stack_FD_0 = stack_127_0 = stack_297_0 = stack_2F6_0 = stack_370_0 = stack_3C6_0 = var_3_275:byte[]
            goto(Label_0115)
        }
        
        var_0_284 = and:int(var_0_284:int, ldc:int(-145376209))
        Label_0735:
        
        while (cmpeq:boolean(and:int(var_0_284:int, ldc:int(524288)), ldc:int(0))) {
            var_0_30F = and:int(var_0_284:int, ldc:int(1851618237))
            var_5_276 = add:int(var_5_276:int, ldc:int(-1))
            expr_2F6 = stack_33E_2 = loadelement(stack_2F6_0, var_5_276)
            
            if (cmplt:boolean(add:int(add:int(var_5_276:int, ldc:int(2)), neg:int(var_4_270:int)), ldc:int(0))) {
                stack_33E_2 = stack_312_0 = add:byte(expr_2F6:byte, loadelement:byte(var_3_275:byte[], add:int(var_5_276:int, ldc:int(2))))
                goto(Label_0802)
            }
            
            Label_0771:
            
            if (cmpne:boolean(and:int(var_0_30F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(1844732323))
                stack_33E_2 = stack_312_0 = add:byte(expr_2F6:byte, ldc:byte(2))
            }
            
            Label_0802:
            
            if (cmpeq:boolean(and:int(var_0_30F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_30F = and:int(var_0_30F:int, ldc:int(-593523191))
                goto(Label_0771)
            }
            
            var_0_284 = and:int(var_0_30F:int, ldc:int(-142772234))
            storeelement:byte(var_3_275:byte[], var_5_276:int, stack_33E_2:byte)
            
            if (cmpne:boolean(var_5_276:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_FB_0 = stack_FD_0 = stack_127_0 = stack_297_0 = stack_2F6_0 = stack_370_0 = stack_3C6_0 = var_3_275:byte[]
            goto(Label_0172)
        }
        
        goto(Label_0632)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_284:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_284 = and:int(var_0_284:int, ldc:int(134499949))
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_0_284:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_284:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_284 = and:int(var_0_284:int, ldc:int(-1845232410))
        }
        else {
            var_0_284 = and:int(var_0_284:int, ldc:int(-20160166))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_270 = expr_A7:int
                var_3_275 = newarray:byte[](byte.class, expr_A7:int)
                var_5_276 = expr_A7:int
                goto(Label_0735)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_284:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_284:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_284 = and:int(var_0_284:int, ldc:int(591185238))
        }
        else {
            if (cmpne:boolean(and:int(var_0_284:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_284 = and:int(var_0_284:int, ldc:int(-510168505))
            var_2_D3 = stack_D3_0:byte[]
            expr_D7 = add:int(arraylength:int(stack_D5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_3_35E = newarray:byte[](byte.class, expr_D7:int)
                var_5_35F = expr_D7:int
                
                loop {
                    var_0_284 = and:int(var_0_284:int, ldc:int(1767305735))
                    var_5_35F = add:int(var_5_35F:int, ldc:int(-1))
                    storeelement:byte(var_3_35E:byte[], var_5_35F:int, add:int(shl:int(loadelement:byte(stack_370_0:byte[], var_5_35F:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_D3:byte[], add:int(var_5_35F:int, xor:int(ldc:int(16448), ldc:int(16449)))), ldc:int(5)), and:int(ldc:int(159), ldc:int(8455)))))
                    
                    if (cmpne:boolean(var_5_35F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_FB_0 = stack_FD_0 = stack_127_0 = stack_297_0 = stack_2F6_0 = stack_370_0 = stack_3C6_0 = var_3_35E:byte[]
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_284:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_284:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_284:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_284 = and:int(var_0_284:int, ldc:int(1703737945))
            expr_FD = arraylength:int(stack_FD_0:byte[])
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_3_3B4 = newarray:byte[](byte.class, expr_FD:int)
                var_5_3B5 = expr_FD:int
                
                loop {
                    var_0_284 = and:int(var_0_284:int, ldc:int(1695998280))
                    var_5_3B5 = add:int(var_5_3B5:int, ldc:int(-1))
                    storeelement:byte(var_3_3B4:byte[], var_5_3B5:int, xor:byte(loadelement:byte(stack_3C6_0:byte[], var_5_3B5:int), ldc:byte(125)))
                    
                    if (cmpne:boolean(var_5_3B5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_FB_0 = stack_FD_0 = stack_127_0 = stack_297_0 = stack_2F6_0 = stack_370_0 = stack_3C6_0 = var_3_3B4:byte[]
            }
        }
        
        Label_0258:
        
        if (cmpne:boolean(and:int(var_0_284:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_284:int, ldc:int(8192)), ldc:int(0))) {
            var_0_284 = and:int(var_0_284:int, ldc:int(-615463766))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_284:int, ldc:int(16384)), ldc:int(0))) {
            var_3_133 = initobject:String(String::<init>, stack_127_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_13B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8459), ldc:int(8450)))
            expr_145 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9), ldc:int(25641)))
            storeelement:String(expr_145:String[], xor:int(ldc:int(9472), ldc:int(9476)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(6426), ldc:int(-6652)), and:int(ldc:int(2), ldc:int(903))))
            storeelement:String(expr_13B:String[], xor:int(ldc:int(128), ldc:int(135)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(4099), ldc:int(4097)), xor:int(ldc:int(-32219), ldc:int(-32200))))
            storeelement:String(expr_145:String[], and:int(ldc:int(6167), ldc:int(205)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(149), ldc:int(136)), xor:int(ldc:int(16558), ldc:int(16560))))
            storeelement:String(expr_13B:String[], xor:int(ldc:int(5255), ldc:int(5263)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(2104), ldc:int(2086)), and:int(ldc:int(8447), ldc:int(7773))))
            storeelement:String(expr_145:String[], and:int(ldc:int(22098), ldc:int(-32508)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(95), ldc:int(7517)), and:int(ldc:int(18666), ldc:int(8806))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(-24440), ldc:int(-24439)), invokevirtual:String[expected:String](String::substring, var_3_133:String, xor:int(ldc:int(-32609), ldc:int(-32515)), and:int(ldc:int(4323), ldc:int(18547))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(17410), ldc:int(17409)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(5475), ldc:int(10487)), xor:int(ldc:int(2676), ldc:int(2588))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(4643), ldc:int(4645)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(2156), ldc:int(1512)), xor:int(ldc:int(2166), ldc:int(2061))))
            storeelement:String(expr_145:String[], and:int(ldc:int(20550), ldc:int(9250)), invokevirtual:String[expected:String](String::substring, var_3_133:String, and:int(ldc:int(16507), ldc:int(4219)), and:int(ldc:int(24703), ldc:int(255))))
            putstatic:String[](\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\u494c\ud158\uc9f6\ud36e\u527a\u74b1, expr_145:String[])
            var_3_242 = expr_13B:String[]
            putstatic:Pattern(\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\ubcb0\u5245\u61a4\u446c\u446c\ub6ab, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_242:String[], and:int(ldc:int(2567), ldc:int(1295))), ldc:int(66)))
            putstatic:Pattern(\u6198\u71f1\u8df4\u71f1\u7d52\u6c56::\uf9c5\u97b7\u71ae\u8258\u97e6\u6b5f, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_242:String[], xor:int(ldc:int(25155), ldc:int(25163))), xor:int(ldc:int(-15328), ldc:int(-15326))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u183a\u71f1\ua562\ud4fe\u8709\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_66A : int
        
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
        var_3_65F = and:int(ldc:int(-1422872415), ldc:int(-1527189343))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\u71f1\u8df4\u71f1\u7d52\u6c56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_65F = and:int(var_3_65F:int, ldc:int(-18296598))
            var_5_81 = and:int(ldc:int(844), ldc:int(-2893))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8237), ldc:int(-8238)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_65F:int, ldc:int(-1972252490))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(4129), ldc:int(8709)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(1793), ldc:int(2069)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_65F = and:int(var_3_D0:int, ldc:int(-1285447700))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(13569), ldc:int(16465)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1891155212))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-742590923))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1191588619))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1220583161))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(522668979))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-725552059))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1015180110))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1801063129))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-668524613))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-997343797))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1950325435))
                            var_11_E1 = and:int(ldc:int(-20728), ldc:int(4327))
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-457003828))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1992627608))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(691335048))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1923804387))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-2030833498))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1887044325))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1052481067))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-17004160))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-33260246))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(614962660))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1340692361))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1740901219))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(999251559))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-799356843))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(2057764668))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-709067454))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(846650608))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(10512), ldc:int(10513))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0962:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-2026572646))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1646416939))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1152227050))
                        var_11_E1 = and:int(ldc:int(-3471), ldc:int(1422))
                    }
                    
                    Label_1103:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1451084070))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0962)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-418589940))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(781314930))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-793773842))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1347)
                            }
                        }
                    }
                    
                    Label_1214:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1650458995))
                        goto(Label_1493)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1103)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1908356545))
                            goto(Label_0962)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1650815425))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1814153767))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(87334327))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                            goto(Label_1482)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1347:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1493)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-513810012))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-63836266))
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1846612228))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1468993220))
                        loopcontinue()
                    }
                    
                    var_3_65F = and:int(var_3_65F:int, ldc:int(-923413255))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1482:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66A = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1493:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(793632822))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1776736009))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1560754625))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(772791210))
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(984170912))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(29541614))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-281816581))
                        var_17_66A = add:int(var_16_10F:int, xor:int(ldc:int(-31724), ldc:int(-31723)))
                        looporswitchbreak()
                    }
                    
                    var_3_65F = and:int(var_3_65F:int, ldc:int(-1483035920))
                }
                
                var_3_65F = and:int(var_3_65F:int, ldc:int(1300025587))
                
                if (cmple:boolean(var_5_81 = var_17_66A:int, sub:int(var_6_88:int, and:int(ldc:int(1033), ldc:int(257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
