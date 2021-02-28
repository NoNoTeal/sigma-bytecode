public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u1187\u624e\u4f52\u965f\u51fa {
    private void \u1187\u624e\u4f52\u965f\u51fa(boolean p0, java.lang.String p1, java.net.URI p2) {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u1187\u624e\u4f52\u965f\u51fa)
            putfield:boolean(\u1187\u624e\u4f52\u965f\u51fa::\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa, this:\u1187\u624e\u4f52\u965f\u51fa, p0:boolean)
            putfield:String(\u1187\u624e\u4f52\u965f\u51fa::\u6198\u3d4b\u960f\u3711\u9937\u7049, this:\u1187\u624e\u4f52\u965f\u51fa, p1:String)
            putfield:URI(\u1187\u624e\u4f52\u965f\u51fa::\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc, this:\u1187\u624e\u4f52\u965f\u51fa, p2:URI)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u1187\u624e\u4f52\u965f\u51fa \u5db4\u3711\u4bc8\ub113\u647c\u0800(java.lang.String p0) {
        var_1_5F : int
        var_3_6C : JsonParser
        var_4_7A : JsonObject
        var_5_95 : String
        var_6_FE : int
        var_7_10C : URI
        var_8_173 : boolean
        var_9_18E : String
        expr_195 : \u1187\u624e\u4f52\u965f\u51fa [generated]
        var_3_1B3 : Exception
        
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
            var_1_5F = and:int(ldc:int(841126440), ldc:int(2112522814))
            
            try {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2147199739))
                var_3_6C = initobject:JsonParser(JsonParser::<init>)
                var_1_5F = and:int(var_1_5F:int, ldc:int(-122711523))
                var_4_7A = invokevirtual:JsonObject(JsonElement::getAsJsonObject, invokevirtual:JsonElement(JsonParser::parse, var_3_6C:JsonParser, p0:String))
                var_1_5F = and:int(var_1_5F:int, ldc:int(1952892910))
                var_5_95 = invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), and:int(ldc:int(-22889), ldc:int(22856))), var_4_7A:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String()))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_5F = and:int(var_1_5F:int, ldc:int(646625281))
                        goto(Label_0218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-1380072534))
                    }
                    else {
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-1092094357))
                        
                        if (cmpeq:boolean(var_5_95:String, aconstnull:String())) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0191:
                    
                    if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(713495151))
                            loopcontinue()
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-186205186))
                    }
                    
                    Label_0218:
                    
                    if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-786546))
                    var_6_FE = invokestatic:int(\u183a\u600f\uf9c5\u4bc8\u647c::\u8413\u8308\ub7dc\ub18d\u3776\u76bc, loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), xor:int(ldc:int(1800), ldc:int(1801))), var_4_7A:JsonObject, ldc:int(-1))
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-177748435))
                    var_7_10C = invokestatic:URI(\u1187\u624e\u4f52\u965f\u51fa::\u7e3f\u7d52\ube23\u4c2b\u071d\u67d0, var_5_95:String, var_6_FE:int)
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0321)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(967769737))
                            
                            if (cmpeq:boolean(var_7_10C:URI, aconstnull:URI())) {
                                looporswitchbreak(Label_0428)
                            }
                        }
                        
                        Label_0294:
                        
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-1051906391))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_5F = and:int(var_1_5F:int, ldc:int(926921341))
                        }
                        
                        Label_0321:
                        
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(509274807))
                            goto(Label_0294)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(963088095))
                            var_8_173 = invokestatic:boolean(\u183a\u600f\uf9c5\u4bc8\u647c::\u0800\u3e75\u56bd\ubb2b\u3dd3\u4bc8, loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), xor:int(ldc:int(-24383), ldc:int(-24381))), var_4_7A:JsonObject, and:int[expected:boolean](ldc:int(1487), ldc:int(-22528)))
                            var_1_5F = and:int(var_1_5F:int, ldc:int(2049615434))
                            var_9_18E = invokestatic:String(\u183a\u600f\uf9c5\u4bc8\u647c::\u600f\u071d\u5d20\u8413\u8308\u4daf, loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), and:int(ldc:int(283), ldc:int(10311))), var_4_7A:JsonObject, checkcast:String(java.lang.String.class, aconstnull:String()))
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-1314128308))
                            expr_195 = initobject:\u1187\u624e\u4f52\u965f\u51fa(\u1187\u624e\u4f52\u965f\u51fa::<init>, var_8_173:boolean, var_9_18E:String, var_7_10C:URI)
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-256930135))
                            return:\u1187\u624e\u4f52\u965f\u51fa(expr_195:\u1187\u624e\u4f52\u965f\u51fa)
                        }
                    }
                }
                
                Label_0428:
            }
            catch (java.lang.Exception var_3_1B3) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u1187\u624e\u4f52\u965f\u51fa::\u8753\u9255\ub70c\ud171\u4f52\ua61f), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), and:int(ldc:int(8486), ldc:int(4117)))), invokevirtual:String(Throwable::getMessage, var_3_1B3:Exception[expected:Throwable]))))
            }
            
            return:\u1187\u624e\u4f52\u965f\u51fa(aconstnull:\u1187\u624e\u4f52\u965f\u51fa())
        }
        
        goto(Label_0006)
    }
    
    public static java.net.URI \u7e3f\u7d52\ube23\u4c2b\u071d\u67d0(java.lang.String p0, int p1) {
        var_2_64 : int
        var_4_6C : Matcher
        var_2_72 : int
        var_5_79 : String
        var_6_89 : URI
        var_7_99 : int
        stack_102_0 : URI [generated]
        var_6_107 : URISyntaxException
        
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
        var_2_64 = and:int(and:int(ldc:int(1154546787), ldc:int(1191104358)), ldc:int(-834278286))
        var_4_6C = invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u1187\u624e\u4f52\u965f\u51fa::\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198), p0:String[expected:CharSequence])
        var_2_72 = and:int(var_2_64:int, ldc:int(-808718490))
        var_5_79 = invokestatic:String(\u1187\u624e\u4f52\u965f\u51fa::\u927d\ua6bd\u56bd\uf94d\u16f6\ubf56, p0:String, var_4_6C:Matcher)
        
        try {
            var_2_72 = and:int(var_2_72:int, ldc:int(-672728345))
            var_6_89 = initobject:URI(URI::<init>, var_5_79:String)
            var_2_72 = and:int(var_2_72:int, ldc:int(-540947098))
            var_7_99 = invokestatic:int(\u1187\u624e\u4f52\u965f\u51fa::\u7bad\uc2e8\u6198\u759a\u4f4a\u4e72, p1:int, invokevirtual:int(URI::getPort, var_6_89:URI))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_72:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_72 = and:int(var_2_72:int, ldc:int(-37629244))
                }
                else {
                    var_2_72 = and:int(var_2_72:int, ldc:int(1205459699))
                    
                    if (cmpeq:boolean(var_7_99:int, invokevirtual:int(URI::getPort, var_6_89:URI))) {
                        stack_102_0 = var_6_89:URI
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_72:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_72 = and:int(var_2_72:int, ldc:int(-43135885))
                    stack_102_0 = initobject:URI(URI::<init>, invokevirtual:String(URI::getScheme, var_6_89:URI), invokevirtual:String(URI::getUserInfo, var_6_89:URI), invokevirtual:String(URI::getHost, var_6_89:URI), var_7_99:int, invokevirtual:String(URI::getPath, var_6_89:URI), invokevirtual:String(URI::getQuery, var_6_89:URI), invokevirtual:String(URI::getFragment, var_6_89:URI))
                    looporswitchbreak()
                }
                
                var_2_72 = and:int(var_2_72:int, ldc:int(665462971))
            }
            
            var_2_72 = and:int(var_2_72:int, ldc:int(1179311863))
            return:URI(stack_102_0:URI)
        }
        catch (java.net.URISyntaxException var_6_107) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\u1187\u624e\u4f52\u965f\u51fa::\u8753\u9255\ub70c\ud171\u4f52\ua61f), loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), xor:int(ldc:int(4164), ldc:int(4161))), var_5_79:String[expected:Object], var_6_107:URISyntaxException[expected:Object])
            return:URI(aconstnull:URI())
        }
    }
    
    private static int \u7bad\uc2e8\u6198\u759a\u4f4a\u4e72(int p0, int p1) {
        var_2_5F : int
        var_2_91 : int
        stack_AF_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(1156231297), ldc:int(-707979933))
        
        if (cmpeq:boolean(p0:int, ldc:int(-1))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_91 = and:int(var_2_5F:int, ldc:int(1349611230))
                }
                else {
                    var_2_91 = and:int(var_2_5F:int, ldc:int(1205178600))
                    
                    if (cmpne:boolean(p1:int, ldc:int(-1))) {
                        stack_AF_0 = p1:int
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_91:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_91 = and:int(var_2_91:int, ldc:int(1286993288))
                    stack_AF_0 = and:int(ldc:int(8152), ldc:int(24464))
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_91:int, ldc:int(-717984022))
            }
            
            return:int(stack_AF_0:int)
        }
        
        return:int(p0:int)
    }
    
    private static java.lang.String \u927d\ua6bd\u56bd\uf94d\u16f6\ubf56(java.lang.String p0, java.util.regex.Matcher p1) {
        var_2_5F : int
        stack_95_0 : String [generated]
        
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
            var_2_5F = and:int(ldc:int(171094722), ldc:int(-1958742791))
            
            if (logicalnot:boolean(invokevirtual:boolean(Matcher::find, p1:Matcher))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1704462209))
                stack_95_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), and:int(ldc:int(8198), ldc:int(2127)))), p0:String))
            }
            else {
                stack_95_0 = p0:String
            }
            
            return:String(stack_95_0:String)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \ub171\u960f\u4492\u56bd\u51b2\ub7dc(java.lang.String p0) {
        var_3_67 : JsonObject
        
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
            var_3_67 = initobject:JsonObject(JsonObject::<init>)
            
            if (cmpne:boolean(p0:String, aconstnull:String())) {
                invokevirtual:void(JsonObject::addProperty, var_3_67:JsonObject, loadelement:String(getstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f), and:int(ldc:int(2051), ldc:int(16967))), p0:String)
            }
            
            return:String(invokevirtual:String(JsonObject::toString, var_3_67:JsonObject))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u59ec\uc29a\u4ab3\ub6ab\u760c\u4f4a() {
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
            return:String(getfield:String(\u1187\u624e\u4f52\u965f\u51fa::\u6198\u3d4b\u960f\u3711\u9937\u7049, this:\u1187\u624e\u4f52\u965f\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public java.net.URI \u156b\u6d99\u8df4\u3e2a\u4bc8\u8df4() {
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
            return:URI(getfield:URI(\u1187\u624e\u4f52\u965f\u51fa::\u6b5f\u5245\uc3e3\ub102\ud36e\u76bc, this:\u1187\u624e\u4f52\u965f\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ubcb0\u51fa\u8350\ub171\u392e\uc2e8() {
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
            return:boolean(getfield:boolean(\u1187\u624e\u4f52\u965f\u51fa::\u8cae\u71f1\u36d3\u8c8a\u7049\u51fa, this:\u1187\u624e\u4f52\u965f\u51fa))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_337 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_132_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2BE_0 : byte[] [generated]
        stack_35B_0 : byte[] [generated]
        stack_3AF_0 : byte[] [generated]
        var_4_24C : int
        var_3_251 : byte[]
        var_5_252 : int
        var_0_2B4 : int
        expr_2BE : byte [generated]
        stack_305_2 : byte [generated]
        stack_2E3_0 : byte [generated]
        expr_35B : byte [generated]
        expr_A7 : int [generated]
        expr_D5 : int [generated]
        var_2_F9 : byte[]
        expr_FD : int [generated]
        var_3_39D : byte[]
        var_5_39E : int
        var_3_13E : String
        expr_146 : String[] [generated]
        expr_150 : String[] [generated]
        var_3_230 : String[]
        
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
        var_0_337 = and:int(ldc:int(-95166778), ldc:int(-1068777263))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D3_0 = stack_D5_0 = stack_F9_0 = stack_FB_0 = stack_132_0 = stack_271_0 = stack_2BE_0 = stack_35B_0 = stack_3AF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("yk8c3Fwk1FU0WXze3SzssbxEBdzznE1PJVWqgSvzH+yUB6mF/FF83t3dzSTri2wS7aY79YWr3QMk9F3bTIWrfoSEpSxbVKQSG5JyVhYO3Hry8swkZFwM9PTsLL1EZdzDjIsUjMTk9MRktE4U1KzCZEBSIiLO")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_24C = expr_6E:int
        var_3_251 = newarray:byte[](byte.class, expr_6E:int)
        var_5_252 = expr_6E:int
        Label_0596:
        
        while (cmpne:boolean(and:int(var_0_337:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0672)
            }
            
            var_0_337 = and:int(var_0_337:int, ldc:int(-362090553))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            storeelement:byte(var_3_251:byte[], var_5_252:int, xor:byte(loadelement:byte(stack_271_0:byte[], var_5_252:int), ldc:byte(36)))
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_F9_0 = stack_FB_0 = stack_132_0 = stack_271_0 = stack_2BE_0 = stack_35B_0 = stack_3AF_0 = var_3_251:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0811)
        Label_0672:
        
        while (cmpne:boolean(and:int(var_0_337:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0596)
            }
            
            var_0_2B4 = and:int(var_0_337:int, ldc:int(1272629185))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            expr_2BE = stack_305_2 = loadelement(stack_2BE_0, var_5_252)
            
            if (cmplt:boolean(add:int(add:int(var_5_252:int, ldc:int(4)), neg:int(var_4_24C:int)), ldc:int(0))) {
                stack_305_2 = stack_2E3_0 = add:byte(expr_2BE:byte, loadelement:byte(var_3_251:byte[], add:int(var_5_252:int, ldc:int(4))))
                goto(Label_0755)
            }
            
            Label_0715:
            
            if (cmpeq:boolean(and:int(var_0_2B4:int, ldc:int(64)), ldc:int(0))) {
                var_0_2B4 = and:int(var_0_2B4:int, ldc:int(822130403))
            }
            else {
                var_0_2B4 = and:int(var_0_2B4:int, ldc:int(-61428019))
                stack_305_2 = stack_2E3_0 = add:byte(expr_2BE:byte, ldc:byte(4))
            }
            
            Label_0755:
            
            if (cmpeq:boolean(and:int(var_0_2B4:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0715)
            }
            
            var_0_337 = and:int(var_0_2B4:int, ldc:int(-832048949))
            storeelement:byte(var_3_251:byte[], var_5_252:int, stack_305_2:byte)
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_F9_0 = stack_FB_0 = stack_132_0 = stack_271_0 = stack_2BE_0 = stack_35B_0 = stack_3AF_0 = var_3_251:byte[]
            goto(Label_0172)
        }
        
        Label_0811:
        
        while (cmpne:boolean(and:int(var_0_337:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(128)), ldc:int(0))) {
                var_0_337 = and:int(var_0_337:int, ldc:int(-1214480796))
                goto(Label_0596)
            }
            
            var_0_337 = and:int(var_0_337:int, ldc:int(-86779147))
            var_5_252 = add:int(var_5_252:int, ldc:int(-1))
            expr_35B = loadelement:byte(stack_35B_0:byte[], var_5_252:int)
            storeelement:byte(var_3_251:byte[], var_5_252:int, add:int(or:int(and:int(shl:int(expr_35B:byte, xor:int(ldc:int(18955), ldc:int(18959))), ldc:int(-16)), and:int(shr:int(expr_35B:byte[expected:int], and:int(ldc:int(14359), ldc:int(16460))), ldc:int(15))), ldc:int(18)))
            
            if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_F9_0 = stack_FB_0 = stack_132_0 = stack_271_0 = stack_2BE_0 = stack_35B_0 = stack_3AF_0 = var_3_251:byte[]
            goto(Label_0218)
        }
        
        var_0_337 = and:int(var_0_337:int, ldc:int(75792548))
        goto(Label_0672)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(1700472442))
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(128)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(2050742928))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(16)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(-1838702634))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_24C = expr_A7:int
                var_3_251 = newarray:byte[](byte.class, expr_A7:int)
                var_5_252 = expr_A7:int
                goto(Label_0672)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(131072)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(1354397178))
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_337 = and:int(var_0_337:int, ldc:int(2053871329))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_24C = expr_D5:int
                var_3_251 = newarray:byte[](byte.class, expr_D5:int)
                var_5_252 = expr_D5:int
                goto(Label_0811)
            }
        }
        
        Label_0218:
        
        if (cmpne:boolean(and:int(var_0_337:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_337:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_337 = and:int(var_0_337:int, ldc:int(2146933998))
            var_2_F9 = stack_F9_0:byte[]
            expr_FD = add:int(arraylength:int(stack_FB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_3_39D = newarray:byte[](byte.class, expr_FD:int)
                var_5_39E = expr_FD:int
                
                loop {
                    var_0_337 = and:int(var_0_337:int, ldc:int(2144257753))
                    var_5_39E = add:int(var_5_39E:int, ldc:int(-1))
                    storeelement:byte(var_3_39D:byte[], var_5_39E:int, add:int(shl:int(loadelement:byte(stack_3AF_0:byte[], var_5_39E:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_F9:byte[], add:int(var_5_39E:int, xor:int(ldc:int(10240), ldc:int(10241)))), ldc:int(7)), xor:int(ldc:int(16512), ldc:int(16513)))))
                    
                    if (cmpne:boolean(var_5_39E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_F9_0 = stack_FB_0 = stack_132_0 = stack_271_0 = stack_2BE_0 = stack_35B_0 = stack_3AF_0 = var_3_39D:byte[]
            }
        }
        
        Label_0258:
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(64)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(-750540811))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_337:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_337:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_337 = and:int(var_0_337:int, ldc:int(127103112))
            goto(Label_0115)
        }
        
        var_3_13E = initobject:String(String::<init>, stack_132_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_146 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16769), ldc:int(16777)))
        expr_150 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(27144), ldc:int(5198)))
        storeelement:String(expr_150:String[], and:int(ldc:int(21508), ldc:int(772)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(-19907), ldc:int(19778)), and:int(ldc:int(540), ldc:int(29))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(386), ldc:int(391)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(12572), ldc:int(3740)), xor:int(ldc:int(4374), ldc:int(4388))))
        storeelement:String(expr_146:String[], and:int(ldc:int(1031), ldc:int(20839)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(-31719), ldc:int(-31701)), xor:int(ldc:int(1536), ldc:int(1611))))
        storeelement:String(expr_150:String[], and:int(ldc:int(5126), ldc:int(19206)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(22607), ldc:int(8667)), xor:int(ldc:int(16900), ldc:int(16982))))
        storeelement:String(expr_150:String[], and:int(ldc:int(4531), ldc:int(9217)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(610), ldc:int(560)), xor:int(ldc:int(144), ldc:int(198))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(11272), ldc:int(11275)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(24159), ldc:int(118)), xor:int(ldc:int(87), ldc:int(12))))
        storeelement:String(expr_150:String[], and:int(ldc:int(3083), ldc:int(-3100)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, and:int(ldc:int(2395), ldc:int(219)), xor:int(ldc:int(4127), ldc:int(4214))))
        storeelement:String(expr_150:String[], xor:int(ldc:int(-28670), ldc:int(-28672)), invokevirtual:String[expected:String](String::substring, var_3_13E:String, xor:int(ldc:int(573), ldc:int(596)), and:int(ldc:int(16508), ldc:int(117))))
        putstatic:String[](\u1187\u624e\u4f52\u965f\u51fa::\ub70c\u8709\u5d20\u6ec6\u6435\u965f, expr_150:String[])
        var_3_230 = expr_146:String[]
        putstatic:Logger(\u1187\u624e\u4f52\u965f\u51fa::\u8753\u9255\ub70c\ud171\u4f52\ua61f, invokestatic:Logger(LogManager::getLogger))
        putstatic:Pattern(\u1187\u624e\u4f52\u965f\u51fa::\u97e6\u9a18\u4cd9\ucb79\u4bc8\u6198, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_230:String[], xor:int(ldc:int(2179), ldc:int(2180)))))
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(560087642), ldc:int(-1415582460))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\u624e\u4f52\u965f\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1647267297))
        }
        else {
            var_3_694 = and:int(var_3_694:int, ldc:int(-172535858))
            var_5_8A = and:int(ldc:int(3301), ldc:int(-3302))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10775), ldc:int(8726)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_694:int, ldc:int(-1797587884))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(9), ldc:int(8)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-32502), ldc:int(-32501)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_E3:int, ldc:int(-464552386))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(275), ldc:int(2053)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2111550760))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(692883290))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2069260782))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1544421934))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-329855069))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1084471555))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1436945802))
                        goto(Label_0617)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1974544654))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0617)
                            }
                            
                            goto(Label_0914)
                        }
                    }
                    
                    Label_0444:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(17225999))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-13978872))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1433644942))
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(336787131))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1319653805))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-698390193))
                        var_11_F4 = and:int(ldc:int(23561), ldc:int(-24124))
                        goto(Label_1564)
                    }
                    
                    Label_0617:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-356586594))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-598629743))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1010369475))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-303582774))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1520288014))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1944687440))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1803133756))
                            goto(Label_0444)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-526980429))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(2133809172))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0914)
                        }
                    }
                    
                    Label_0775:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(342427716))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-218946503))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1055112137))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(610821526))
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0444)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-752636017))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(2123351306))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0914:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1645516967))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1728969137))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1802136148))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0444)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(293058374))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-336074733))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(289), ldc:int(24665))
                                goto(Label_1174)
                            }
                        }
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1226860034))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-445886125))
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0444)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(574505351))
                        var_11_F4 = and:int(ldc:int(-15179), ldc:int(14920))
                    }
                    
                    Label_1174:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-395236900))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1188159188))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-903324126))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1914567495))
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0444)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-265835542))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1561067828))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1422)
                            }
                        }
                    }
                    
                    Label_1305:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1174)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-123896945))
                            goto(Label_0775)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0444)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1558279403))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(177956805))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1564)
                    }
                    
                    Label_1422:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1775011919))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1314083529))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-282486768))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(36349519))
                        goto(Label_0617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-567535147))
                        goto(Label_0444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(989288242))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-170700268))
                        goto(Label_1305)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-913716442))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(832293779))
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-291320888))
                        var_17_69F = add:int(var_16_122:int, and:int(ldc:int(2563), ldc:int(9393)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(1750678156))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(1861678033))
                
                if (cmple:boolean(var_5_8A = var_17_69F:int, sub:int(var_6_91:int, xor:int(ldc:int(2086), ldc:int(2087))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1750929004))
            goto(Label_0108)
        }
    }
}
